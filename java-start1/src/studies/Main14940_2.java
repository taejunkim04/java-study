package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main14940_2 {
    //쉬운 최단 거리(다시 풀기)
    static int n, m;
    static boolean[][] visited;
    static int[][] intMap;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        n = Integer.parseInt(tk.nextToken());
        m = Integer.parseInt(tk.nextToken());
        intMap = new int[n][m];
        visited = new boolean[n][m];
        int[] startPoint = new int[2];
        for (int i = 0; i < n; i++) {
            tk = new StringTokenizer(reader.readLine());
            for (int j = 0; j < m; j++) {
                int temp = Integer.parseInt(tk.nextToken());
                if (temp == 1) {
                    intMap[i][j] = -1;
                } else if (temp == 0) {
                    visited[i][j] = true;
                } else if (temp == 2) {
                    startPoint[0] = i;
                    startPoint[1] = j;
                    visited[i][j] = true;
                }
            }
        }
        fullMap(startPoint[0], startPoint[1]);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(intMap[i][j] + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    static void fullMap(int x, int y) {
        int[] moveX = new int[]{1, -1, 0, 0};
        int[] moveY = new int[]{0, 0, 1, -1};

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        int count = 0;
        while (!queue.isEmpty()) {
            int temp = queue.size();
            for (int i = 0; i < temp; i++) {
                int[] point = queue.remove();
                int curX = point[0];
                int curY = point[1];
                intMap[curX][curY] = count;
                for (int j = 0; j < 4; j++) {
                    int tempX = curX + moveX[j];
                    int tempY = curY + moveY[j];
                    if (tempX >= 0 && tempX < m && tempY >= 0 && tempY < n) {
                        if (!visited[tempX][tempY]) {
                            visited[tempX][tempY] = true;
                            queue.add(new int[]{tempX, tempY});
                        }
                    }
                }
            }
            count++;
        }
    }
}
