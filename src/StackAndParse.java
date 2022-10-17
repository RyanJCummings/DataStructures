import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class StackAndParse {
    //TODO Write a stack and use it to parse a text file.  Count balanceable punctuation and keep in mind comments and quotes inside of strings.

    public StackAndParse() {}
    ArrayList<Character> stack;
    Map<Character, Integer> punctuation = Map.of('{', 0, '}', 0, '[', 0, ']', 0, '\'', 0, '\"', 0, '<', 0, '>', 0, '(', 0, ')', 0);

    private void push(Character ch) {
        stack.add(0, ch);
    }

    /**
     *
     * @return popped character from top of stack
     */
    public Character pop() {
        Character ch = stack.get(0);
        stack.remove(0);
        return ch;
    }

    /**
     *
     * @param file Input Text File
     * @throws FileNotFoundException
     */
    public void parseFile(File file) throws FileNotFoundException {
        Scanner sc = new Scanner(file);
        Character currentChar = sc.next().charAt(0);
        for (Character i : punctuation.keySet() ) {
            if (currentChar.equals(i)) {
                push(currentChar);
                punctuation.put(currentChar, punctuation.get(currentChar) + 1);
            }
        }
    }

    public Boolean checkPunctuation() {
        Character ch = pop();

        return false;
    }
}
