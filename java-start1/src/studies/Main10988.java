package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main10988 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            stack.add(str.charAt(i));
            queue.add(str.charAt(i));
        }
        boolean result = true;
        for (int i = 0; i < str.length(); i++) {
            if (stack.pop() != queue.remove()) {
                result = false;
                break;
            }
        }
        if (result) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
