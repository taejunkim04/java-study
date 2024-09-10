package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2669 {
    private static boolean[][] area = new boolean[101][101];
    private static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 4; i++) {
            StringTokenizer tk = new StringTokenizer(reader.readLine());
            int startX = Integer.parseInt(tk.nextToken());
            int startY = Integer.parseInt(tk.nextToken());
            int endX = Integer.parseInt(tk.nextToken());
            int endY = Integer.parseInt(tk.nextToken());
            giveAr(startX, startY, endX, endY);
        }
        System.out.println(count);
    }

    private static void giveAr(int startX, int startY, int endX, int endY) {
        for (int i = startX; i < endX; i++) {
            for (int j = startY; j < endY; j++) {
                if (!area[i][j]) {
                    area[i][j] = true;
                    count++;
                }
            }
        }
    }
}
