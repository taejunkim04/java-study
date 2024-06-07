package studies;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int max = Integer.parseInt(tokenizer.nextToken());
        int delete = Integer.parseInt(tokenizer.nextToken());
        int count = 1;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= max; i++) {
            queue.add(i);
        }
        StringBuilder str = new StringBuilder();
        str.append("<");
        while (true) {
            if (count != delete) {
                queue.add(queue.peek());
                queue.remove();
                count++;
            } else {
                str.append(queue.peek());
                queue.remove();
                count = 1;
                if (queue.size() == 0) {
                    break;
                }
                str.append(", ");
            }
        }
        str.append(">");
        System.out.println(str);
    }
}
