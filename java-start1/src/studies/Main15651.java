package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main15651 {

    public static int n, m;
    public static StringBuilder sb = new StringBuilder();
    public static int[] values;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());

        n = Integer.parseInt(tk.nextToken());
        m = Integer.parseInt(tk.nextToken());

        values = new int[m];

        nAndM(0);
        System.out.println(sb);
    }

    public static void nAndM(int depth) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                sb.append(values[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i = 1; i <= n; i++) {
            values[depth] = i;
            nAndM(depth+1);
        }
    }
}
