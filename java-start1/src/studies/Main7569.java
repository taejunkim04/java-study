package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main7569 {
    //토마토
    static int[][][] map;
    static boolean[][][] visited;
    static int col,rec, he,zeroCou;
    static Queue<int[]> queue = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        col = Integer.parseInt(tk.nextToken());
        rec = Integer.parseInt(tk.nextToken());
        he = Integer.parseInt(tk.nextToken());
        map = new int[rec][col][he];
        visited = new boolean[rec][col][he];
        zeroCou = 0;

        for (int i = 0; i < he; i++) {
            for (int j = 0; j < rec; j++) {
                tk = new StringTokenizer(reader.readLine());
                for (int k = 0; k < col; k++) {
                    int temp = Integer.parseInt(tk.nextToken());
                    if (temp == 0) {
                        map[j][k][i] = 0;
                        zeroCou++;
                    } else if (temp == 1) {
                        map[j][k][i] = 1;
                        visited[j][k][i] = true;
                        queue.add(new int[]{j, k, i});
                    } else {
                        map[j][k][i] = -1;
                        visited[j][k][i] = true;
                    }
                }
            }
        }
        System.out.println(run());
    }

    static int run() {
        if (zeroCou == 0) {
            return 0;
        }
        int runCount = 0;
        int[] ga = new int[]{-1, 1, 0, 0, 0, 0};
        int[] se = new int[]{0, 0, -1, 1, 0, 0};
        int[] up = new int[]{0, 0, 0, 0, -1, 1};

        while (!queue.isEmpty()) {
            int run = queue.size();
            for (int i = 0; i < run; i++) {
                int[] point = queue.remove();
                for (int j = 0; j < 6; j++) {
                    int a = point[0] + ga[j];
                    int b = point[1] + se[j];
                    int c = point[2] + up[j];
                    if (a < 0 || a >= rec || b < 0 || b >= col || c < 0 || c >= he) {
                        continue;
                    }
                    if (!visited[a][b][c]) {
                        queue.add(new int[]{a, b, c});
                        visited[a][b][c] = true;
                        zeroCou--;
                    }
                }
            }
            runCount++;
        }
        if (zeroCou == 0) {
            return runCount - 1;
        } else {
            return -1;
        }
    }
}
