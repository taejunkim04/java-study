package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main10810 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(tk.nextToken());
        int m = Integer.parseInt(tk.nextToken());

        int[] values = new int[n + 1];
        for (int i = 0; i < m; i++) {
            tk = new StringTokenizer(reader.readLine());
            int start = Integer.parseInt(tk.nextToken());
            int end = Integer.parseInt(tk.nextToken());
            int num = Integer.parseInt(tk.nextToken());
            for (int j = start; j <= end; j++) {
                values[j] = num;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(values[i]).append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }
}
