package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1012 {
    //유기농 배추
    static StringBuilder sb = new StringBuilder();
    static boolean[][] map;
    static boolean[][] visited;
    static int ga, se;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int caseCou = Integer.parseInt(reader.readLine());
        StringTokenizer tk;

        for (int i = 0; i < caseCou; i++) {
            tk = new StringTokenizer(reader.readLine());
            ga = Integer.parseInt(tk.nextToken());
            se = Integer.parseInt(tk.nextToken());
            int grow = Integer.parseInt(tk.nextToken());

            map = new boolean[ga][se];
            visited = new boolean[ga][se];
            for (int j = 0; j < grow; j++) {
                tk = new StringTokenizer(reader.readLine());
                map[Integer.parseInt(tk.nextToken())][Integer.parseInt(tk.nextToken())] = true;
            }
            ser();
        }
        System.out.println(sb);
    }

    static void ser() {
        int count = 0;
        for (int i = 0; i < ga; i++) {
            for (int j = 0; j < se; j++) {
                if (map[i][j] && !visited[i][j]) {
                    count++;
                    dfs(i,j);
                }
            }
        }
        sb.append(count).append("\n");
    }

    static void dfs(int curX, int curY) {
        if (curX < 0 || curX >= ga || curY < 0 || curY >= se) {
            return;
        }
        if (map[curX][curY] && !visited[curX][curY]) {
            visited[curX][curY] = true;
            dfs(curX + 1, curY);
            dfs(curX - 1, curY);
            dfs(curX, curY + 1);
            dfs(curX, curY - 1);
        }
    }
}
