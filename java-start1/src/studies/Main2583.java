package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main2583 {
    //영역 구하기
    static Queue<Integer> areaSizes = new PriorityQueue<>();
    static boolean[][] map;
    static int rec, col, k, resValue = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        rec = Integer.parseInt(tk.nextToken());
        col = Integer.parseInt(tk.nextToken());
        k = Integer.parseInt(tk.nextToken());
        map = new boolean[rec][col];

        for (int i = 0; i < k; i++) {
            tk = new StringTokenizer(reader.readLine());
            int colSt = Integer.parseInt(tk.nextToken());
            int recSt = Integer.parseInt(tk.nextToken());
            int colEnd = Integer.parseInt(tk.nextToken());
            int recEnd = Integer.parseInt(tk.nextToken());
            for (int j = colSt; j < colEnd; j++) {
                for (int l = recSt; l < recEnd; l++) {
                    map[l][j] = true;
                }
            }
        }
        ser();
        System.out.println(resValue);
        StringBuilder sb = new StringBuilder();
        while (!areaSizes.isEmpty()) {
            sb.append(areaSizes.remove()).append(" ");
        }
        System.out.println(sb);
    }

    static void ser() {
        for (int i = 0; i < rec; i++) {
            for (int j = 0; j < col; j++) {
                if (!map[i][j]) {
                    resValue++;
                    areaSizes.add(dfs(i, j));
                }
            }
        }
    }

    static int dfs(int curRec, int curCol) {
        if (curRec < 0 || curRec >= rec || curCol < 0 || curCol >= col) {
            return 0;
        }

        if (!map[curRec][curCol]) {
            map[curRec][curCol] = true;
            int sum = 1;
            sum += dfs(curRec + 1, curCol);
            sum += dfs(curRec, curCol + 1);
            sum += dfs(curRec - 1, curCol);
            sum += dfs(curRec, curCol - 1);
            return sum;
        }
        return 0;
    }
}
