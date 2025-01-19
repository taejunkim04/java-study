package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1149 {
    //RGB거리
    static int[][] dp;
    static int[][] values;
    static int houseCou;
    final static int Red = 0;
    final static int Green = 1;
    final static int Blue = 2;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        houseCou = Integer.parseInt(reader.readLine());
        dp = new int[houseCou][3];
        values = new int[houseCou][3];

        StringTokenizer tk;
        for (int i = 0; i < houseCou; i++) {
            tk = new StringTokenizer(reader.readLine());
            for (int j = 0; j < 3; j++) {
                values[i][j] = Integer.parseInt(tk.nextToken());
            }
        }
        dp[0][Red] = values[0][Red];
        dp[0][Green] = values[0][Green];
        dp[0][Blue] = values[0][Blue];
        int res = Math.min(
                dp(houseCou - 1, Red),
                Math.min(dp(houseCou - 1, Green), dp(houseCou - 1, Blue)));
        System.out.println(res);
    }

    static int dp(int depth, int color) {
        if(dp[depth][color] == 0) {

            // color의 색에 따라 이전 집의 서로 다른 색을 재귀호출하여 최솟값과 현재 집의 비용을 더해서 DP에 저장한다
            if(color == Red) {
                dp[depth][Red] = Math.min(dp(depth - 1, Green), dp(depth - 1, Blue)) + values[depth][Red];
            }
            else if(color == Green) {
                dp[depth][Green] = Math.min(dp(depth - 1, Red), dp(depth - 1, Blue)) + values[depth][Green];
            }
            else {
                dp[depth][Blue] = Math.min(dp(depth - 1, Red), dp(depth - 1, Green)) + values[depth][Blue];
            }

        }

        return dp[depth][color];
    }
}
