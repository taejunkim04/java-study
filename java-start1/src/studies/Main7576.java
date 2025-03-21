package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main7576 {
    //토마토
    static int rec, col, yetCou = 0;
    static boolean[][] visited;
    static Queue<int[]> queue = new LinkedList<>();
    static int[] dx = new int[]{1, -1, 0, 0};
    static int[] dy = new int[]{0, 0, 1, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        col = Integer.parseInt(tk.nextToken());
        rec = Integer.parseInt(tk.nextToken());
        visited = new boolean[rec][col];

        for (int i = 0; i < rec; i++) {
            tk = new StringTokenizer(reader.readLine());
            for (int j = 0; j < col; j++) {
                int temp = Integer.parseInt(tk.nextToken());
                if (temp == -1) {
                    visited[i][j] = true;
                } else if (temp == 1) {
                    queue.add(new int[]{i, j});
                    visited[i][j] = true;
                } else {
                    yetCou++;
                }
            }
        }
        System.out.println(bfs());
    }

    static int bfs() {
        if (yetCou == 0) {
            return 0;
        }
        int day = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] pop = queue.remove();
                for (int j = 0; j < 4; j++) {
                    int newRec = pop[0] + dy[j];
                    int newCol = pop[1] + dx[j];
                    if (newRec >= 0 && newRec < rec && newCol >= 0 && newCol < col && !visited[newRec][newCol]) {
                        queue.add(new int[]{newRec, newCol});
                        visited[newRec][newCol] = true;
                        yetCou--;
                    }
                }
            }
            day++;
        }
        if (yetCou == 0) {
            return day - 1;
        } else {
            return -1;
        }
    }
}
