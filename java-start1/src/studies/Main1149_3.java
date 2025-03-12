package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1149_3 {
    //RGB거리
    static int count;
    static int[][] dp;
    static int[][] values;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        count = Integer.parseInt(reader.readLine());
        dp = new int[count][3];
        values = new int[count][3];
        StringTokenizer tk;
        for (int i = 0; i < count; i++) {
            tk = new StringTokenizer(reader.readLine());
            for (int j = 0; j < 3; j++) {
                values[i][j] = Integer.parseInt(tk.nextToken());
            }
        }
        dp[count - 1][0] = values[count - 1][0];
        dp[count - 1][1] = values[count - 1][1];
        dp[count - 1][2] = values[count - 1][2];
        int res = Math.min(pow(0, 0), Math.min(pow(1, 0), pow(2, 0)));
        System.out.println(res);
    }

    static int pow(int cur, int depth) {
        if (dp[depth][cur] == 0) {
            if (cur == 0) {
                dp[depth][cur] = Math.min(pow(1, depth + 1), pow(2, depth + 1)) + values[depth][cur];
            } else if (cur == 1) {
                dp[depth][cur] = Math.min(pow(0, depth + 1), pow(2, depth + 1)) + values[depth][cur];
            } else {
                dp[depth][cur] = Math.min(pow(0, depth + 1), pow(1, depth + 1)) + values[depth][cur];
            }
            return dp[depth][cur];
        } else {
            return dp[depth][cur];
        }
    }
}
