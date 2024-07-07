package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main9095 {
    static int[] dp = new int[11];
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int caseValue = Integer.parseInt(reader.readLine());
        StringBuilder sb = new StringBuilder();
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for (int i = 4; i < 11; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }//dp 알고리즘을 이용하여 배열화
        for (int i = 0; i < caseValue; i++) {
            sb.append(dp[Integer.parseInt(reader.readLine())]).append("\n");
        }
        System.out.println(sb);
    }
}
