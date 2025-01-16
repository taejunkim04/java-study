package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2178 {
    //미로 탐색
    static int n, m;
    static int resCou = Integer.MAX_VALUE;
    static boolean[][] map;
    static int[][] minMap;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        n = Integer.parseInt(tk.nextToken());
        m = Integer.parseInt(tk.nextToken());
        map = new boolean[n][m];
        minMap = new int[n][m];
        for (int i = 0; i < n; i++) {
            String s = reader.readLine();
            for (int j = 0; j < s.length(); j++) {
                map[i][j] = s.charAt(j) == '1';
                minMap[i][j] = Integer.MAX_VALUE;
            }
        }
        dfs(0, 0, 1);
        System.out.println(resCou);
    }

    static void dfs(int curX, int curY, int count) {
        if (curX < 0 || curX >= n || curY < 0 || curY >= m) {
            return;
        }
        if (curX == n - 1 && curY == m - 1) {
            resCou = Math.min(count, resCou);
            return;
        }
        if (map[curX][curY] && minMap[curX][curY] > count) {
            minMap[curX][curY] = count;
            dfs(curX + 1, curY, count + 1);
            dfs(curX - 1, curY, count + 1);
            dfs(curX, curY + 1, count + 1);
            dfs(curX, curY - 1, count + 1);
        }
    }
}
