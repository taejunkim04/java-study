package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        int valueCou = Integer.parseInt(tk.nextToken());
        int caseCou = Integer.parseInt(tk.nextToken());

        int[] values = new int[valueCou];
        tk = new StringTokenizer(reader.readLine());
        values[0] = Integer.parseInt(tk.nextToken());
        for (int i = 1; i < valueCou; i++) {
            values[i] = Integer.parseInt(tk.nextToken()) + values[i - 1];
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < caseCou; i++) {
            tk = new StringTokenizer(reader.readLine());
            int first = Integer.parseInt(tk.nextToken());
            if (first == 1) {
                sb.append(values[Integer.parseInt(tk.nextToken()) - 1]).append("\n");
            } else {
                int temp = values[Integer.parseInt(tk.nextToken()) - 1] - values[first - 2];
                sb.append(temp).append("\n");
            }
        }
        System.out.println(sb);
    }
}
