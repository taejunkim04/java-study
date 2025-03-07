package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main11660 {
    //구간 합 구하기
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        int size = Integer.parseInt(tk.nextToken());
        int caseCou = Integer.parseInt(tk.nextToken());
        int[][] values = new int[size][size];

        for (int i = 0; i < size; i++) {
            tk = new StringTokenizer(reader.readLine());
            values[i][0] = Integer.parseInt(tk.nextToken());
            for (int j = 1; j < size; j++) {
                values[i][j] = Integer.parseInt(tk.nextToken()) + values[i][j - 1];
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < caseCou; i++) {
            tk = new StringTokenizer(reader.readLine());
            int x1 = Integer.parseInt(tk.nextToken()) - 1;
            int y1 = Integer.parseInt(tk.nextToken()) - 1;
            int x2 = Integer.parseInt(tk.nextToken()) - 1;
            int y2 = Integer.parseInt(tk.nextToken()) - 1;
            int res = 0;

            if (y1 == 0) {
                for (int j = x1; j <= x2; j++) {
                    res += values[j][y2];
                }
            } else {
                for (int j = x1; j <= x2; j++) {
                    res += values[j][y2] - values[j][y1 - 1];
                }
            }
            sb.append(res).append("\n");
        }
        System.out.println(sb);
    }
}
