package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(tk.nextToken());
        int m = Integer.parseInt(tk.nextToken());
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = i + 1;
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            tk = new StringTokenizer(reader.readLine());
            int start = Integer.parseInt(tk.nextToken()) - 1;
            int end = Integer.parseInt(tk.nextToken()) - 1;
            for (int j = start; j <= end; j++) {
                queue.add(values[j]);
            }
            for (int j = end; j >= start; j--) {
                values[j] = queue.poll();
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int value : values) {
            sb.append(value).append(" ");
        }
        System.out.println(sb);
    }
}
