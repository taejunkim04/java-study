package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2630 {
    static int white = 0;
    static int black = 0;
    static boolean[][] paper;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(reader.readLine());
        paper = new boolean[size][size];
        StringTokenizer tk;
        for (int i = 0; i < size; i++) {
            tk = new StringTokenizer(reader.readLine());
            for (int j = 0; j < size; j++) {
                paper[i][j] = Integer.parseInt(tk.nextToken()) == 1;
            }
        }
        parti(0, 0, size);
        System.out.println(white);
        System.out.println(black);
    }

    static void parti(int x, int y, int n) {
        boolean flag = true;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(paper[x][y] != paper[x + i][y + j]) {
                    flag = false;
                    break;
                }
                if(!flag)
                    break;
            }
        }
        // 탐색한 영역이 한가지 색으로 통일된 경우
        if (flag) {
            if(!paper[x][y]) {
                white++;
            }else {
                black++;
            }
        }else {
            parti(x, y, n / 2);
            parti(x + n / 2, y, n / 2);
            parti(x, y + n / 2, n / 2);
            parti(x + n / 2, y + n / 2, n / 2);
        }
    }
}
