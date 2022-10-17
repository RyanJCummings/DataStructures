import java.io.*;
import java.util.ArrayList;

public class StackAndParse {
    //TODO Write a stack and use it to parse a text file.  Count balanceable punctuation and keep in mind comments and quotes inside of strings.
    ArrayList<Character> stack = new ArrayList<>();

    public StackAndParse() {}

    //Character[] punctuation = new Character[]{'{',  '}',  '[',  ']',  '\'',  '\"',  '<',  '>',  '(',  ')'};

    private void push(Character ch) {
        stack.add(ch);
    }

    /**0,
     *
     * @return popped character from top of stack
     */
    public Character pop() {
        Character ch = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return ch;
    }

    /**
     *
     * @param file Input Text File
     * @throws IOException
     */
    public void readFile(File file) throws IOException {
        int r;

        try (InputStream in = new FileInputStream(file);
             Reader reader = new InputStreamReader(in)) {
            while ((r = reader.read()) != -1) {
                char ch = (char) r;
                push(ch);
            }
        }
    }

    /**
     *
     * @return Boolean representing whether all punctuation is balanced.
     */
    public Boolean checkPunctuation() {
        Character ch;
        int curly = 0;
        int square = 0;
        int angle = 0;
        int paren = 0;
        int singleQuote = 0;
        int doubleQuote = 0;

        while(!stack.isEmpty()) {
            ch = pop();
            if (ch.equals('{') || ch.equals('}')) {
                curly++;
            } else if (ch.equals('[') || ch.equals(']')) {
                square++;
            } else if (ch.equals('\'')) {
                singleQuote++;
            } else if (ch.equals('\"')) {
                doubleQuote++;
            } else if (ch.equals('<') || ch.equals('>')) {
                angle++;
            } else if (ch.equals('(') || ch.equals(')')) {
                paren++;
            }
        }

        if (curly % 2 == 0 && square % 2 == 0 && angle % 2 == 0
                && paren % 2 == 0 && singleQuote % 2 == 0 &&
                doubleQuote % 2 == 0) {
            return true;
        }
        return false;
    }
}
