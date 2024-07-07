package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());//입력 갯수
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int current = 1;
        boolean resultBoolean = true;

        for (int i = 0; i < count; i++) {
            int inValue = Integer.parseInt(reader.readLine());
            if (inValue >= current) {
                while (inValue >= current) {
                    stack.push(current++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            } else {
                if (stack.peek() == inValue) {
                    stack.pop();
                    sb.append("-\n");
                } else {
                    resultBoolean = false;
                    break;
                }
            }
        }


        if (resultBoolean) {
            System.out.println(sb);
        } else {
            System.out.println("NO");
        }
    }
}
