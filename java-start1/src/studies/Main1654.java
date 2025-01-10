package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1654 {
    static int[] have;
    static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        n = Integer.parseInt(tk.nextToken());
        m = Integer.parseInt(tk.nextToken());
        have = new int[n];
        long max = 0;

        for (int i = 0; i < n; i++) {
            have[i] = Integer.parseInt(reader.readLine());
            if (have[i] > max) {
                max = have[i];
            }
        }
        max++;

        long min = 0;
        long mid;

        while (min < max) {
            mid = (max + min) / 2;
            if (div(mid) < m) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }
        System.out.println(min-1);
    }

    static long div(long cutLength) {
        long count = 0;
        for (int i : have) {
            count += i / cutLength;
        }
        return count;
    }
}
