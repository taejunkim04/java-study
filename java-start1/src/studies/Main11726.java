package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main11726 {
    static int n;
    static int[] values = new int[1000];
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(reader.readLine());
        System.out.println(dp());
    }

    static int dp() {
        values[0] = 1;
        values[1] = 2;
        for (int i = 2; i < n; i++) {
            values[i] = (values[i - 1] + values[i - 2]) % 10007;
        }
        return values[n - 1];
    }
}
