package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2468 {
    //안전 영역
    static int mapSize, maxHigh, maxSafeZoneCount;
    static int[][] map;
    static boolean[][] safeZone, visited;
    static int[] dx = new int[]{1, -1, 0, 0};
    static int[] dy = new int[]{0, 0, 1, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        mapSize = Integer.parseInt(reader.readLine());
        map = new int[mapSize][mapSize];

        StringTokenizer tk;
        maxHigh = -1;
        for (int i = 0; i < mapSize; i++) {
            tk = new StringTokenizer(reader.readLine());
            for (int j = 0; j < mapSize; j++) {
                map[i][j] = Integer.parseInt(tk.nextToken());
                if (map[i][j] > maxHigh) {
                    maxHigh = map[i][j];
                }
            }
        }

        maxSafeZoneCount = 1;
        safeZone = new boolean[mapSize][mapSize];//false가 갈 수 있는 곳을 의미
        for (int i = 1; i <= maxHigh; i++) {
            visited = new boolean[mapSize][mapSize];
            for (int j = 0; j < mapSize; j++) {
                for (int k = 0; k < mapSize; k++) {
                    if (map[j][k] == i) {
                        safeZone[j][k] = true;
                    }
                }
            }
            maxSafeZoneCount = Math.max(maxSafeZoneCount, ser());
        }
        System.out.println(maxSafeZoneCount);
    }

    static int ser() {
        int count = 0;
        for (int i = 0; i < mapSize; i++) {
            for (int j = 0; j < mapSize; j++) {
                if (!safeZone[i][j] && !visited[i][j]) {
                    dfs(i, j);
                    count++;
                }
            }
        }
        return count;
    }

    static void dfs(int curX, int curY) {
        if (curX < 0 || curX >= mapSize || curY < 0 || curY >= mapSize) {
            return;
        }
        if (visited[curX][curY] || safeZone[curX][curY]) {
            return;
        }
        visited[curX][curY] = true;
        for (int i = 0; i < 4; i++) {
            int nextX = curX + dx[i];
            int nextY = curY + dy[i];
            dfs(nextX, nextY);
        }
    }
}
