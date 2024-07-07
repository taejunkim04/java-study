package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inString = reader.readLine();
        StringBuilder results = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < inString.length(); i++) {
            if (inString.charAt(i) != '<') {
                stack.add(inString.charAt(i));
                i++;
                while (inString.charAt(i) != ' ' && inString.charAt(i) !='<') {
                    stack.add(inString.charAt(i));
                    if (inString.length() - 1 > i) {
                        i++;
                    } else {
                        break;
                    }
                }
                while (!stack.isEmpty()) {
                    results.append(stack.pop());
                }
                if (i != inString.length() - 1 && inString.charAt(i) !='<') {
                    results.append(' ');
                }
                if (inString.charAt(i) == '<') {
                    i--;
                }
            }
            if (inString.charAt(i) == '<') {
                results.append('<');
                i++;
                while (inString.charAt(i) != '>') {
                    results.append(inString.charAt(i));
                    i++;
                }
                results.append('>');
            }
        }
        System.out.println(results);
    }
}
