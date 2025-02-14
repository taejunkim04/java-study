package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main11053 {
    static int num;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(reader.readLine());

        int[] dp = new int[num];
        int[] values = new int[num];
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        for (int i = 0; i < num; i++) {
            values[i] = Integer.parseInt(tk.nextToken());
        }
        dp[0] = 1;
        for (int i = 1; i < num; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (values[i] > values[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        int max = 0;
        for (int i : dp) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println(max);
    }
}
