package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main14503 {
    //로봇청소기
    //0 1 2 3 북동남서
    static int n, m, look, clear = 0;
    static boolean[][] road, visited;
    static int[] lookX = new int[]{-1, 0, 1, 0};
    static int[] lookY = new int[]{0, 1, 0, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        n = Integer.parseInt(tk.nextToken());
        m = Integer.parseInt(tk.nextToken());
        tk = new StringTokenizer(reader.readLine());
        int startX = Integer.parseInt(tk.nextToken());
        int startY = Integer.parseInt(tk.nextToken());
        look = Integer.parseInt(tk.nextToken());
        road = new boolean[n][m];
        visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            tk = new StringTokenizer(reader.readLine());
            for (int j = 0; j < m; j++) {
                //벽이 있는 경우
                if (1 == Integer.parseInt(tk.nextToken())) {
                    road[i][j] = true;
                    visited[i][j] = true;
                }
            }
        }
        run(startX, startY);
        System.out.println(clear);
    }

    static void run(int startX, int startY) {
        int curX = startX;
        int curY = startY;
        while (true) {
            //현재 칸 청소
            if (!visited[curX][curY]) {
                clear++;
                visited[curX][curY] = true;
            }
            //주변 4칸 서치
            if (ser(curX + 1, curY, false) || ser(curX - 1, curY, false) || ser(curX, curY + 1, false) || ser(curX, curY - 1, false)) {
                //회전
                look = (look + 3) % 4;
                //빈 칸이 있는 경우 전진
                if (ser(curX + lookX[look], curY + lookY[look],false)) {
                    curX += lookX[look];
                    curY += lookY[look];
                }
                //없는 경우
            } else {
                int back = (look + 2) % 4;
                //벽이 아닌 경우
                if (ser(curX + lookX[back], curY + lookY[back], true)) {
                    curX += lookX[back];
                    curY += lookY[back];
                } else {
                    //벽인 경우
                    break;
                }
            }
        }

    }

    static boolean ser(int rec, int col, boolean askRoad) {
        if (rec < 0 || rec >= n || col < 0 || col >= m) {
            return false;
        }
        if (askRoad) {
            return !road[rec][col];
        }
        return !visited[rec][col];
    }
}
