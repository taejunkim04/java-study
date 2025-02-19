package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main14940 {
    //쉬운 최단 거리
    static boolean[][] road;
    static boolean[][] visited;
    static int[][] map;
    static int x, y;
    static int[] moveX = {1, -1, 0, 0};
    static int[] moveY = {0, 0, 1, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        x = Integer.parseInt(tk.nextToken());
        y = Integer.parseInt(tk.nextToken());
        road = new boolean[x][y];
        visited = new boolean[x][y];
        map = new int[x][y];
        int startX = 0, startY = 0;
        for (int i = 0; i < x; i++) {
            tk = new StringTokenizer(reader.readLine());
            for (int j = 0; j < y; j++) {
                int temp = Integer.parseInt(tk.nextToken());
                if (temp == 1) {
                    road[i][j] = true;
                } else if (temp == 0) {
                    road[i][j] = false;
                    visited[i][j] = true;
                } else {
                    startX = i;
                    startY = j;
                }
            }
        }

        bfs(startX, startY);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (!visited[i][j]) {
                    sb.append(-1 + " ");
                } else {
                    sb.append(map[i][j] + " ");
                }
            }
            sb.append("\n");
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }

    static void bfs(int curX, int curY) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{curX, curY});
        visited[curX][curY] = true;

        while (!queue.isEmpty()) {
            int[] tmp = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = tmp[0] + moveX[i];
                int ny = tmp[1] + moveY[i];
                if (nx >= 0 && nx < x && ny >= 0 && ny < y) {
                    if (!visited[nx][ny] && road[nx][ny]) {
                        visited[nx][ny] = true;
                        map[nx][ny] = map[tmp[0]][tmp[1]] + 1;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }
    }
}
