package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main15652 {
    public static int[] numbers;
    public static int[] values;
    public static int n,m;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());

        n = Integer.parseInt(tk.nextToken());
        m = Integer.parseInt(tk.nextToken());

        numbers = new int[m];
        values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = i + 1;
        }

        n_m(2,0);
        System.out.println(sb);
    }

    public static void n_m(int deleteNum,int depth) {
        if (depth == m) {
            for (int number : numbers) {
                sb.append(number).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i = deleteNum - 1; i <= n; i++) {
            numbers[depth] = i;
            n_m(i + 1, depth + 1);
        }
    }
}
