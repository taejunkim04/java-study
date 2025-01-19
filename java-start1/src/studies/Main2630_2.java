package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2630_2 {
    //색종이 만들기 다시 풀기
    static int blue = 0;
    static int white = 0;
    static boolean[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(reader.readLine());
        map = new boolean[length][length];
        StringTokenizer tk;
        for (int i = 0; i < length; i++) {
            tk = new StringTokenizer(reader.readLine());
            for (int j = 0; j < length; j++) {
                map[i][j] = Integer.parseInt(tk.nextToken()) == 1;
            }
        }
        pation(length, 0, 0);
        System.out.println(white);
        System.out.println(blue);
    }

    static void pation(int size, int startX, int startY) {
        boolean check = map[startX][startY];
        boolean okay = true;
        for (int i = startX; i < startX+size; i++) {
            for (int j = startY; j < startY+size; j++) {
                if (check != map[i][j]) {
                    pation(size / 2, startX, startY);
                    pation(size / 2, startX, startY + size/2);
                    pation(size / 2, startX + size/2, startY);
                    pation(size / 2, startX + size / 2, startY + size / 2);
                    return;
                }
            }
        }
        if (okay) {
            if (check) {
                blue++;
            } else {
                white++;
            }
        }
    }
}
