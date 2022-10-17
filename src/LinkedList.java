import java.io.*;
import java.util.*;

public class LinkedList{
    //TODO Make a linked list wherein insertion is based on the sorted order of the item. Must be generic and implement comparable.
    Node head = null;   // track the start of the linked list

    public LinkedList() {}

    public Node insert(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            return node;
        }
        else {

        }

        return node;
    }

    public Node findOrder(Node insertNode, Node current) {
        // Base Case
        if (insertNode.getValue() == current.getValue()) {
            return current;
        }
        return current;
    }
}

