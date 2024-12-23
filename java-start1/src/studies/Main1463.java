package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1463 {
    static int minCount = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int value = Integer.parseInt(reader.readLine());

        dp(value,0);
        System.out.println(minCount);
    }

    static void dp(int value, int count) {
        if (value == 1) {
            minCount = Math.min(count, minCount);
            return;
        }
        if (value % 3 == 0) {
            dp(value / 3, count + 1);
        }
        if (value % 2 == 0) {
            dp(value / 2, count + 1);
        }
        if (count > minCount) {
            return;
        }
        dp(value - 1, count + 1);
    }
}
