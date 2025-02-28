package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main11053_2 {
    //가장 긴 증가하는 부분 수열
    static int count;
    static int[] values;
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        count = Integer.parseInt(reader.readLine());
        values = new int[count];
        dp = new int[count];
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        for (int i = 0; i < count; i++) {
            values[i] = Integer.parseInt(tk.nextToken());
        }
        dp[0] = 1;
        for (int i = 0; i < count; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (values[i] > values[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        int max = 0;
        for (int i : dp) {
            max = Math.max(max, i);
        }
        System.out.println(max);
    }
}
