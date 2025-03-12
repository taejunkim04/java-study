package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main9465_2 {
    //스티커
    static int caseCou;
    static int[][] map;
    static Integer[][] dp;
    static int size;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        caseCou = Integer.parseInt(reader.readLine());

        StringTokenizer tk;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < caseCou; i++) {
            size = Integer.parseInt(reader.readLine());
            map = new int[2][size];
            dp = new Integer[2][size];
            for (int j = 0; j < 2; j++) {
                tk = new StringTokenizer(reader.readLine());
                for (int k = 0; k < size; k++) {
                    map[j][k] = Integer.parseInt(tk.nextToken());
                }
            }
            //위에서 시작
            int up = run(0, 0);
            //아래에서 시작
            int down = run(1, 0);
            sb.append(Math.max(up, down)).append("\n");
        }
        System.out.println(sb);
    }

    static int run(int x, int y) {
        if (y >= size) {
            return 0;
        }
        if (dp[x][y] == null) {
            if (x == 0) {
                dp[x][y] = Math.max(run(1, y + 1), run(1, y + 2));
            } else {
                dp[x][y] = Math.max(run(0, y + 1), run(0, y + 2));
            }
        }
        return map[x][y] + dp[x][y];
    }
}
