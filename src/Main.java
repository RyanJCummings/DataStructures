import java.io.File;
import java.io.IOException;

public class Main {

    public static void main (String[] Args) throws IOException {

        // Stack Challenge
        StackAndParse parser = new StackAndParse();
        File file1 = new File("src/input1.txt");
        File file2 = new File("src/input2.txt");
        File file3 = new File("src/input3.txt");
        System.out.println("File 1 is balanced: " + parser.parseFile(file1));    // should succeed
        System.out.println("File 2 is balanced: " + parser.parseFile(file2));    // should succeed
        System.out.println("File 3 is balanced: " + parser.parseFile(file3));    // should fail


        // Linked List Challenge
        LinkedList<IntegerData> linkedList = new LinkedList<>();

        linkedList.insert(linkedList.createNode(new IntegerData(1)));
        linkedList.insert(linkedList.createNode(new IntegerData(5)));
        linkedList.insert(linkedList.createNode(new IntegerData(0)));
        linkedList.insert(linkedList.createNode(new IntegerData(4)));

        System.out.println("\nLinked List: ");
        linkedList.printList();


    }
}