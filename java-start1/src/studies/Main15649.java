package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main15649 {
    private static int n;
    private static int m;
    private static boolean[] values;
    private static int[] outValues;

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        n = Integer.parseInt(tk.nextToken());
        m = Integer.parseInt(tk.nextToken());
        values = new boolean[n];
        outValues = new int[m];
        depth(0);
        System.out.println(sb);
    }

    private static void depth(int depth) {
        if (depth == m) {
            for (int outValue : outValues) {
                sb.append(outValue).append(" ");
            }
            sb.append("\n");
        } else {
            for (int i = 0; i < n; i++) {
                if (!values[i]) {
                    outValues[depth] = i + 1;
                    values[i] = true;
                    depth(depth + 1);
                    values[i] = false;
                }
            }
        }
    }
}
