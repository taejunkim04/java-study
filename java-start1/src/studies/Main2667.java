package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main2667 {
    //단지 번호 붙이기
    static int size, danZi;
    static int totalDanZi = 0;
    static boolean[][] boMap;
    static boolean[][] visited;
    static Queue<Integer> queue = new PriorityQueue<>();


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(reader.readLine());
        boMap = new boolean[size][size];
        visited = new boolean[size][size];

        for (int i = 0; i < size; i++) {
            String s = reader.readLine();
            for (int j = 0; j < size; j++) {
                boMap[i][j] = s.charAt(j) == '1';
            }
        }
        makeDfsMap();


        StringBuilder sb = new StringBuilder();
        sb.append(totalDanZi).append("\n");
        while (!queue.isEmpty()) {
            sb.append(queue.poll()).append("\n");
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }

    static void makeDfsMap() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (boMap[i][j] && !visited[i][j]) {
                    danZi = 0;
                    dfs(i, j);
                    totalDanZi++;
                    queue.add(danZi);
                }
            }
        }
    }

    static void dfs(int x, int y) {
        if (x < 0 || x >= size || y < 0 || y >= size) {
            return;
        } else if (visited[x][y]) {
            return;
        }

        if (boMap[x][y]) {
            visited[x][y] = true;
            danZi++;
            dfs(x - 1, y);
            dfs(x + 1, y);
            dfs(x, y - 1);
            dfs(x, y + 1);
        }
    }
}
