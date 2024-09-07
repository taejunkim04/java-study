package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2167 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(tk.nextToken());
        int m = Integer.parseInt(tk.nextToken());
        int[][] values = new int[n][m];

        for (int i = 0; i < n; i++) {
            tk = new StringTokenizer(reader.readLine());
            for (int j = 0; j < m; j++) {
                values[i][j] = Integer.parseInt(tk.nextToken());
            }
        }

        int playCount = Integer.parseInt(reader.readLine());
        for (int i = 0; i < playCount; i++) {
            tk = new StringTokenizer(reader.readLine());
            int startX = Integer.parseInt(tk.nextToken());
            int startY = Integer.parseInt(tk.nextToken());
            int endX = Integer.parseInt(tk.nextToken());
            int endY = Integer.parseInt(tk.nextToken());

            int sum = 0;
            for (int x = startX - 1; x < endX; x++) {
                for (int y = startY - 1; y < endY; y++) {
                    sum += values[x][y];
                }
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }
}
