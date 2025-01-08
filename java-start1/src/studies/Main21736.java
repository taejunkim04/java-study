package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main21736 {
    static int n, m, count;
    static boolean[][] visited;
    static int[][] map;
    static int unitX, unitY;
    static BufferedReader reader;
    public static void main(String[] args) throws IOException {
        reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        n = Integer.parseInt(tk.nextToken());
        m = Integer.parseInt(tk.nextToken());

        visited = new boolean[n][m];
        map = new int[n][m];
        count = 0;
        setMap();
        dfs(unitX, unitY);
        if (count == 0) {
            System.out.println("TT");
        } else {
            System.out.println(count);
        }
    }

    static void dfs(int curX, int curY) {
        if (curX >= n || curX < 0 || curY >= m || curY < 0) {
            return;
        }
        if (visited[curX][curY]) {
            return;
        }
        if (map[curX][curY] == 3) {
            count++;
        }
        visited[curX][curY] = true;
        dfs(curX + 1, curY);
        dfs(curX, curY + 1);
        dfs(curX - 1, curY);
        dfs(curX, curY - 1);
    }

    static void setMap() throws IOException {
        for (int i = 0; i < n; i++) {
            String temp = reader.readLine();
            for (int j = 0; j < m; j++) {
                switch (temp.charAt(j)) {
                    case 'O':
                        map[i][j] = 0;//빈공간
                        break;
                    case 'X':
                        map[i][j] = 1;//벽
                        visited[i][j] = true;
                        break;
                    case 'I':
                        unitX = i;
                        unitY = j;
                        map[i][j] = 2;//주인공
                        break;
                    case 'P':
                        map[i][j] = 3;//사람
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
