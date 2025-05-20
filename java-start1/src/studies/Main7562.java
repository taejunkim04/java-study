package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main7562 {
    //나이트의 이동
    static Queue<int[]> queue;
    static int[][] moving = new int[][]{{2, 1}, {2, -1}, {-2, 1}, {-2, -1}, {1, 2}, {-1, 2}, {1, -2}, {-1, -2}};
    static int caseCou, mapSize,startR,startC,endR, endC, moveCou;
    static boolean[][] visitedMap;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        caseCou = Integer.parseInt(reader.readLine());

        StringTokenizer tk;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < caseCou; i++) {
            mapSize = Integer.parseInt(reader.readLine());
            visitedMap = new boolean[mapSize][mapSize];
            tk = new StringTokenizer(reader.readLine());
            startR = Integer.parseInt(tk.nextToken());
            startC = Integer.parseInt(tk.nextToken());
            tk = new StringTokenizer(reader.readLine());
            endR = Integer.parseInt(tk.nextToken());
            endC = Integer.parseInt(tk.nextToken());
            moveCou = 0;
            sb.append(run()).append("\n");
        }
        System.out.println(sb);
    }

    static int run() {
        if (startR == endR && startC == endC) {
            return 0;
        }
        queue = new LinkedList<>();
        queue.add(new int[]{startR, startC});
        visitedMap[startC][startR] = true;
        while (true) {
            int queueSize = queue.size();
            for (int i = 0; i < queueSize; i++) {
                int[] values = queue.remove();
                for (int j = 0; j < 8; j++) {
                    int[] nextValues = new int[]{values[0] + moving[j][0], values[1] + moving[j][1]};
                    if (nextValues[0] == endR && nextValues[1] == endC) {
                        return moveCou + 1;
                    }
                    if (nextValues[0] >= 0 && nextValues[0] < mapSize && nextValues[1] >= 0 && nextValues[1] < mapSize && !visitedMap[nextValues[0]][nextValues[1]]) {
                        visitedMap[nextValues[0]][nextValues[1]] = true;
                        queue.add(new int[]{nextValues[0], nextValues[1]});
                    }
                }
            }
            moveCou++;
        }
    }
}
