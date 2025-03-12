package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1932_3 {
    //정수삼각형
    static int count;
    static int[][] values;
    static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        count = Integer.parseInt(reader.readLine());
        values = new int[count][count];
        dp = new int[count][count];
        StringTokenizer tk;
        for (int i = 0; i < count; i++) {
            tk = new StringTokenizer(reader.readLine());
            for (int j = 0; j < i + 1; j++) {
                values[i][j] = Integer.parseInt(tk.nextToken());
                dp[i][j] = -1;
            }
        }
        for (int i = 0; i < count; i++) {
            dp[count - 1][i] = values[count - 1][i];
        }
        System.out.println(run(0, 0));
    }

    static int run(int curX, int curY) {
        if (curX == count - 1) {
            return dp[curX][curY];
        }
        if (dp[curX][curY] != -1) {
            return dp[curX][curY];
        }
        return dp[curX][curY] = Math.max(run(curX + 1, curY), run(curX + 1, curY + 1)) + values[curX][curY];
    }
}
