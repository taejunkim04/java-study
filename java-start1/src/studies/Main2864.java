package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2864 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        int[][] big_small = new int[2][2];

        for (int i = 0; i < 2; i++) {
            int mainS = Integer.parseInt(tk.nextToken());
            int smallValue = 0;
            int bigValue = 0;
            int point = 1;
            while (mainS > 0) {
                int temp = mainS % 10;
                if (temp == 5 || temp == 6) {
                    smallValue += 5 * point;
                    bigValue += 6 * point;
                } else {
                    smallValue += temp * point;
                    bigValue += temp * point;
                }
                mainS /= 10;
                point *= 10;
            }
            big_small[i][0] = smallValue;
            big_small[i][1] = bigValue;
        }
        int small = big_small[0][0] + big_small[1][0];
        int big = big_small[0][1] + big_small[1][1];
        System.out.println(small + " " + big);
    }
}
