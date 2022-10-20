import java.io.File;
import java.io.IOException;

public class Main {

    public static void main (String[] Args) throws IOException {
        /***
         * Stack Challenge
         */
        StackAndParse parser = new StackAndParse();
        File file1 = new File("src/input1.txt");
        File file2 = new File("src/input2.txt");
        File file3 = new File("src/input3.txt");
        System.out.println("File 1 is balanced: " + parser.parseFile(file1));    // should succeed
        System.out.println("File 2 is balanced: " + parser.parseFile(file2));    // should succeed
        System.out.println("File 3 is balanced: " + parser.parseFile(file3));    // should fail

        /***
         * Linked List Challenge
         */
        LinkedList linkedList = new LinkedList();

        Node node = linkedList.createNode(1);
        linkedList.insert(node);

        node = linkedList.createNode(5);
        linkedList.insert(node);

        node = linkedList.createNode(0);
        linkedList.insert(node);

        node = linkedList.createNode(4);
        linkedList.insert(node);

        linkedList.printList();


    }
}