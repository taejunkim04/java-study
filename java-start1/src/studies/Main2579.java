package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2579 {
    static Integer[] dp;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        arr = new int[count + 1];
        dp = new Integer[count + 1];
        for (int i = 1; i <= count; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        dp[0] = arr[0];
        dp[1] = arr[1];

        if(count >= 2) {
            dp[2] = arr[1] + arr[2];
        }

        System.out.println(find(count));
    }
    static int find(int N) {
        if(dp[N] == null) {
            dp[N] = Math.max(find(N - 2), find(N - 3) + arr[N - 1]) + arr[N];
        }

        return dp[N];
    }
}
