import java.io.File;
import java.io.IOException;

public class Main {

    public static void main (String[] Args) throws IOException {
        StackAndParse parser = new StackAndParse();
        //LinkedList linkList = new LinkedList();
        File file = new File("src/input.txt");
        parser.readFile(file);

        if (parser.checkPunctuation()) {
            System.out.println(parser.checkPunctuation());
        } else {
            System.out.println("false");
        }

    }
}