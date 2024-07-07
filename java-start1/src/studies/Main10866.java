package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main10866 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> integers = new LinkedList<>();
        int count = Integer.parseInt(reader.readLine());
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            StringTokenizer tk = new StringTokenizer(reader.readLine());
            String s = tk.nextToken();
            if (s.equals("push_front")) {
                integers.addFirst(Integer.parseInt(tk.nextToken()));
            } else if (s.equals("push_back")) {
                integers.addLast(Integer.parseInt(tk.nextToken()));
            } else if (s.equals("pop_front")) {
                if (integers.peekFirst() == null) {
                    builder.append(-1).append("\n");
                } else {
                    builder.append(integers.removeFirst()).append("\n");
                }
            } else if (s.equals("pop_back")) {
                if (integers.peekLast() == null) {
                    builder.append(-1).append("\n");
                } else {
                    builder.append(integers.removeLast()).append("\n");
                }
            } else if (s.equals("size")) {
                builder.append(integers.size()).append("\n");
            } else if (s.equals("empty")) {
                if (integers.peek()==null) {
                    builder.append(1).append("\n");
                } else {
                    builder.append(0).append("\n");
                }
            } else if (s.equals("front")) {
                if (integers.isEmpty()) {
                    builder.append(-1).append("\n");
                } else {
                    builder.append(integers.peekFirst()).append("\n");
                }
            } else if (s.equals("back")) {
                if (integers.isEmpty()) {
                    builder.append(-1).append("\n");
                } else {
                    builder.append(integers.peekLast()).append("\n");
                }
            }
        }
        System.out.println(builder);
    }
}
