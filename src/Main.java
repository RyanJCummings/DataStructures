import java.io.File;
import java.io.IOException;

public class Main {

    public static void main (String[] Args) throws IOException {
        StackAndParse parser = new StackAndParse();
        //LinkedList linkList = new LinkedList();
        File file1 = new File("src/input1.txt");
        File file2 = new File("src/input2.txt");
        File file3 = new File("src/input3.txt");
        System.out.println(parser.parseFile(file1));    // should succeed
        System.out.println(parser.parseFile(file2));    // should succeed
        System.out.println(parser.parseFile(file3));    // should fail




    }
}