package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10026 {
    //적록색약
    //0은 red 1은 Green 2는 blue rg는 true, b는 false
    static int size;
    static int[][] map;
    static boolean[][] visited, rgMap;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(reader.readLine());
        map = new int[size][size];
        visited = new boolean[size][size];
        rgMap = new boolean[size][size];
        for (int i = 0; i < size; i++) {
            String s = reader.readLine();
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'B') {
                    map[i][j] = 2;
                } else {
                    rgMap[i][j] = true;
                    if (s.charAt(j) == 'R') {
                        map[i][j] = 0;
                    } else {
                        map[i][j] = 1;
                    }
                }
            }
        }
        System.out.println(normal());
        visited = new boolean[size][size];
        System.out.println(spec());
    }

    static int normal() {
        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (!visited[i][j]) {
                    visited[i][j] = true;
                    count++;
                    normalExpend(i + 1, j, map[i][j]);
                    normalExpend(i - 1, j, map[i][j]);
                    normalExpend(i, j + 1, map[i][j]);
                    normalExpend(i, j - 1, map[i][j]);
                }
            }
        }
        return count;
    }

    static void normalExpend(int curX, int curY, int last) {
        if (curX < 0 || curX >= size || curY < 0 || curY >= size) {
            return;
        }
        if (visited[curX][curY]) {
            return;
        }
        if (last == map[curX][curY]) {
            visited[curX][curY] = true;
            normalExpend(curX + 1, curY, last);
            normalExpend(curX - 1, curY, last);
            normalExpend(curX, curY + 1, last);
            normalExpend(curX, curY - 1, last);
        }
    }

    static int spec() {
        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (!visited[i][j]) {
                    visited[i][j] = true;
                    count++;
                    specExpend(i+1, j, rgMap[i][j]);
                    specExpend(i-1, j, rgMap[i][j]);
                    specExpend(i, j+1, rgMap[i][j]);
                    specExpend(i, j-1, rgMap[i][j]);
                }
            }
        }
        return count;
    }
    static void specExpend(int curX, int curY, boolean rg) {
        if (curX < 0 || curX >= size || curY < 0 || curY >= size) {
            return;
        }
        if (visited[curX][curY]) {
            return;
        }
        if (rg == rgMap[curX][curY]) {
            visited[curX][curY] = true;
            specExpend(curX + 1, curY, rg);
            specExpend(curX - 1, curY, rg);
            specExpend(curX, curY + 1, rg);
            specExpend(curX, curY - 1, rg);
        }
    }
}
