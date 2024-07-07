package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> leftStack = new Stack<>();
        Stack<Character> rightStack = new Stack<>();
        String s = reader.readLine();
        int count = Integer.parseInt(reader.readLine());//입력 갯수
        for (int i = 0; i < s.length(); i++) {
            leftStack.add(s.charAt(i));
        }
        for (int i = 0; i < count; i++) {
            String inValue = reader.readLine();
            if (inValue.equals("L")) {
                if (!leftStack.isEmpty()) {
                    rightStack.add(leftStack.pop());
                }
            } else if (inValue.equals("D")) {
                if (!rightStack.isEmpty()) {
                    leftStack.add(rightStack.pop());
                }
            } else if (inValue.equals("B")) {
                if (!leftStack.isEmpty()) {
                    leftStack.pop();
                }
            } else if (inValue.charAt(0) == 'P') {
                leftStack.add(inValue.charAt(2));
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!leftStack.isEmpty()) {
            rightStack.add(leftStack.pop());
        }
        while (!rightStack.isEmpty()) {
            sb.append(rightStack.pop());
        }
        System.out.println(sb);
    }
}
