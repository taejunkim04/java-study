package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(tk.nextToken());
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }
        int num = Integer.parseInt(tk.nextToken());
        sb.append("<");
        int count = 1;
        while (!queue.isEmpty()) {
            if (count == num) {
                sb.append(queue.poll()).append(", ");
                count = 1;
            } else {
                queue.add(queue.poll());
                count++;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.deleteCharAt(sb.length() - 1);
        //콤마와 공백 제거
        sb.append(">");
        System.out.println(sb);
    }
}
