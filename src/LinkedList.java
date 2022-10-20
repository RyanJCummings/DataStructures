import java.io.*;
import java.util.*;

public class LinkedList{
    //TODO Make a linked list wherein insertion is based on the sorted order of the item. Must be generic and implement comparable.
    Node head = null;   // track the start of the linked list

    public LinkedList() {}

    /**
     * creates a node
     * @param value sortable value of the node to be inserted
     * @return new node
     */
    public Node createNode(int value) {
        return new Node(value);
    }

    /**
     * helper method to kick off recursive insert with correct params
     * @param insertNode
     */
    public void insert(Node insertNode) {
        insertHelper(insertNode, head);
    }
    /**
     * recursively finds correct sorted location and inserts node
     * @param insertNode
     * @param current
     * @return recursive call to search list
     */
    private Node insertHelper(Node insertNode, Node current) {
        // Base Cases
        // If list is empty
        if (head == null) {
            head = insertNode;
            return insertNode;
        }
        // If new node is lowest value
        else if (insertNode.getValue() < head.getValue()) {
            insertNode.setNext(head);
            head = insertNode;
            return insertNode;
        }
        // if new node has same value
        else if (insertNode.getValue() == current.getValue()) {
            current.setNext(insertNode);
            return insertNode;
        }
        // if new node is greatest value
        else if (insertNode.getValue() > current.getValue() && current.getNext() == null) {
            current.setNext(insertNode);
            insertNode.setNext(null);
            return insertNode;
        }
        // if new node is in correct location for sorted value
        else if (insertNode.getValue() > current.getValue() && insertNode.getValue() < current.getNext().getValue()) {
            insertNode.setNext(current.getNext());
            current.setNext(insertNode);
            return insertNode;
        }
        // recursively compare to next node in list
        else {
            return insertHelper(insertNode, current.getNext());
        }
    }

    /**
     * kicks off recursive print method
     */
    public void printList() {
        printHelper(head);
    }

    /**
     * recursively prints the linked list
     * @param current
     * @return recursive call to printlist
     */
    private Node printHelper(Node current) {
        // base case
        if (current.getNext() ==  null) {
            System.out.println(current.getValue());
            return current;
        }
        // recursively move to next node
        else {
            System.out.println(current.getValue());
            return printHelper(current.getNext());
        }
    }
}

