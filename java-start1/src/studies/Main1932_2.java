package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1932_2 {
    //정수 삼각형
    static int count;
    static int[][] arr;
    static Integer[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        count = Integer.parseInt(reader.readLine());

        arr = new int[count][count];
        dp = new Integer[count][count];

        StringTokenizer tk;
        for (int i = 0; i < count; i++) {
            tk = new StringTokenizer(reader.readLine());
            for (int j = 0; j < i + 1; j++) {
                arr[i][j] = Integer.parseInt(tk.nextToken());
            }
        }
        for (int i = 0; i < count; i++) {
            dp[count - 1][i] = arr[count - 1][i];
        }
        System.out.println(ser(0,0));

    }

    static int ser(int depth, int loc) {
        if (depth == count - 1) {
            return dp[depth][loc];
        }
        if (dp[depth][loc] == null) {
            dp[depth][loc] = Math.max(ser(depth + 1, loc), ser(depth + 1, loc + 1)) + arr[depth][loc];
        }
        return dp[depth][loc];
    }
}
