public class Node {
    private Node next = null;
    private int value;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public Node getNext() {return this.next;}
    public void setNext(Node reference) {this.next = reference;}
}
