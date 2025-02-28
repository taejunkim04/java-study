package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1932 {
    //바텀업 방식(메모리 감소)
    static int count;
    static int[][] arr;
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        count = Integer.parseInt(reader.readLine());

        arr = new int[count][];
        dp = new int[count];

        StringTokenizer tk;
        for (int i = 0; i < count; i++) {
            arr[i] = new int[i + 1];
            tk = new StringTokenizer(reader.readLine());
            for (int j = 0; j < i + 1; j++) {
                arr[i][j] = Integer.parseInt(tk.nextToken());
            }
        }
        // 초기 dp 설정 (마지막 행 복사)
        System.arraycopy(arr[count - 1], 0, dp, 0, count);

        // Bottom-up DP 적용 (위쪽으로 이동하면서 값 갱신)
        for (int i = count - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                dp[j] = Math.max(dp[j], dp[j + 1]) + arr[i][j];
            }
        }

        System.out.println(dp[0]);
    }
}
