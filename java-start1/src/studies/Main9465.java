package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main9465 {
    //스티커
    static int[][] values;
    static int[][] dp;
    static int col;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int caseCou = Integer.parseInt(reader.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer tk;

        for (int i = 0; i < caseCou; i++) {
            col = Integer.parseInt(reader.readLine());
            values = new int[2][col + 1];
            dp = new int[2][col + 1];
            for (int j = 0; j < 2; j++) {
                tk = new StringTokenizer(reader.readLine());
                for (int k = 1; k <= col; k++) {
                    values[j][k] = Integer.parseInt(tk.nextToken());
                }
            }
            sb.append(ser()).append("\n");
        }
        System.out.println(sb);
    }

    static int ser() {
        dp[0][1] = values[0][1];
        dp[1][1] = values[1][1];
        for (int i = 2; i <= col; i++) {
            dp[0][i] = Math.max(dp[1][i - 1], dp[1][i - 2]) + values[0][i];
            dp[1][i] = Math.max(dp[0][i - 1], dp[0][i - 2])+ values[1][i];
        }
        return Math.max(dp[0][col], dp[1][col]);
    }
}
