public class LinkedList<T extends Comparable> {
    //TODO Make a linked list wherein insertion is based on the sorted order of the item. Must be generic and implement comparable.
    Node<T> head = null;   // track the start of the linked list

    public LinkedList() {}

    /**
     * creates a node
     * @param value sortable value of the node to be inserted
     * @return new node
     */
    public Node<T> createNode(T value) {
        return new Node<>(value);
    }

    /**
     * helper method to kick off recursive insert with correct params
     * @param insertNode node to be inserted
     */
    public void insert(Node<T> insertNode) {
        recursiveInsert(insertNode, head);
    }
    /**
     * recursively finds correct sorted location and inserts node
     * @param insertNode node to be inserted
     * @param current current node, iterated for recursive calls
     * @return Node
     */
    private Node<T> recursiveInsert(Node<T> insertNode, Node<T> current) {
        // Base Cases
        // If list is empty
        if (head == null) {
            head = insertNode;
            return insertNode;
        }
        // If new node is lowest value
        else if (insertNode.getValue().compareTo(head.getValue()) < 0) {
            insertNode.setNext(head);
            head = insertNode;
            return insertNode;
        }
        // if new node has same value
        else if (insertNode.getValue().compareTo(current.getValue()) == 0) {
            current.setNext(insertNode);
            return insertNode;
        }
        // if new node is greatest value
        else if (insertNode.getValue().compareTo(current.getValue()) > 0 && current.getNext() == null) {
            current.setNext(insertNode);
            insertNode.setNext(null);
            return insertNode;
        }
        // if new node is in correct location for sorted value
        else if (insertNode.getValue().compareTo(current.getValue()) > 0 && insertNode.getValue().compareTo(current.getNext().getValue()) < 0) {
            insertNode.setNext(current.getNext());
            current.setNext(insertNode);
            return insertNode;
        }
        // recursively compare to next node in list
        else {
            return recursiveInsert(insertNode, current.getNext());
        }
    }

    /**
     * kicks off recursive print method
     */
    public void printList() {
        recursivePrint(head);
    }

    /**
     * recursively prints the linked list
     * @param current current node iterated for recursive calls
     * @return recursive call to printlist
     */
    private Node<T> recursivePrint(Node<T> current) {
        // base case
        if (current.getNext() ==  null) {
            System.out.println(current.getValue());
            return current;
        }
        // recursively move to next node
        else {
            System.out.println(current.getValue());
            return recursivePrint(current.getNext());
        }
    }
}

