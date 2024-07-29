package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main15665 {
    public static int[] numbers;
    public static int[] values;
    public static int n,m;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());

        n = Integer.parseInt(tk.nextToken());
        m = Integer.parseInt(tk.nextToken());

        numbers = new int[n];//값들을 보관
        values = new int[m];//출력될 dfs를 보관

        tk = new StringTokenizer(reader.readLine());

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(tk.nextToken());
        }
        Arrays.sort(numbers);

        n_m(0);

        System.out.print(sb);
    }

    public static void n_m(int depth) {
        if (depth == m) {
            for (int number : values) {
                sb.append(number).append(" ");
            }
            sb.append("\n");
            return;
        }
        int back = -1;
        for (int i = 0; i < n; i++) {
            int now = numbers[i];
            if (back != now) {
                back = now;
                values[depth] = numbers[i];
                n_m(depth + 1);
            }
        }
    }
}
