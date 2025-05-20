package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1926 {
    //그림
    static int rec, col,drawCou=0, biggestSize = 0;
    static boolean[][] map;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        rec = Integer.parseInt(tk.nextToken());
        col = Integer.parseInt(tk.nextToken());
        map = new boolean[rec][col];
        for (int i = 0; i < rec; i++) {
            tk = new StringTokenizer(reader.readLine());
            for (int j = 0; j < col; j++) {
                map[i][j] = Integer.parseInt(tk.nextToken()) == 1;
            }
        }
        ser();
        System.out.println(drawCou);
        System.out.print(biggestSize);
    }

    static void ser() {
        for (int i = 0; i < rec; i++) {
            for (int j = 0; j < col; j++) {
                if (map[i][j]) {
                    drawCou++;
                    int temp = dfs(i, j);
                    if (biggestSize < temp) {
                        biggestSize = temp;
                    }
                }
            }
        }
    }

    static int dfs(int curR, int curC) {
        if (curR < 0 || curR >= rec || curC < 0 || curC >= col) {
            return 0;
        }
        if (!map[curR][curC]) {
            return 0;
        } else {
            int sum = 1;
            map[curR][curC] = false;
            sum += dfs(curR + 1, curC);
            sum += dfs(curR, curC + 1);
            sum += dfs(curR - 1, curC);
            sum += dfs(curR, curC - 1);
            return sum;
        }
    }
}
