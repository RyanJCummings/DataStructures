import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * StackandParse class reads in a text file and uses a stack to check if balanceable
 * punctuation is indeed balanced. e.g. every '(' has a corresponding ')'
 * Only the stack methods necessary to complete this task have been included.
 */
public class StackAndParse {
    ArrayList<Character> stack = new ArrayList<>();
    Map<Character, Character> punctMap = new HashMap<>() {{
        put('}', '{');
        put(']', '[');
        put(')', '(');
        put('\'', '\'');
        put('"', '"');
        put('>', '<');
    }};

    public StackAndParse() {}


    /**
     * pushes a value onto the stack
     * @param ch char to be added to stack
     */
    private void push(Character ch) {
        stack.add(ch);
    }

    /**
     * @return popped character from top of stack
     */
    private Character pop() {
        Character ch = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return ch;
    }

    /**
     * @param file Input Text File
     * @throws IOException
     * @return boolean representing whether all punctuation is balanced
     */
    public boolean parseFile(File file) throws IOException {
        int r;
        Character fileChar;

        try (InputStream in = new FileInputStream(file);
             Reader reader = new InputStreamReader(in)) {
            while ((r = reader.read()) != -1) {
                fileChar = (char) r;
                // if char is an opening balanceable, push on stack
                if (punctMap.containsValue(fileChar)) {
                    push(fileChar);
                }
                // if char is a closing balanceable, pop stack and compare
                if (punctMap.containsKey(fileChar)) {
                    if (!punctMap.get(fileChar).equals(pop())) {
                        return false;
                    }
                }
            }
            // if stack size is non-zero, some punctuation is not balanced
            if (stack.size() != 0) {
                return false;
            }
            return true;
        }
    }
}
