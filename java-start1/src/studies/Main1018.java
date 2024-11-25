package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1018 {
    static boolean[][] values;
    static int res1 = Integer.MAX_VALUE;
    static int n, m;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        n = Integer.parseInt(tk.nextToken());
        m = Integer.parseInt(tk.nextToken());

        values = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            String s = reader.readLine();
            for (int j = 0; j < m; j++) {
                values[i][j] = s.charAt(j) == 'W';
            }
        }
        allSearch();
        System.out.println(res1);
    }

    static void allSearch() {
        for (int i = 0; i < n - 7; i++) {
            for (int j = 0; j < m - 7; j++) {
                res1 = Math.min(res1, check(i, j));
            }
        }
    }

    static int check(int i, int j) {
        boolean start = values[i][j];
        int tempCheck1 = 0;
        for (int k = i; k < i + 8; k++) {
            for (int l = j; l < j + 8; l++) {
                if (start != values[k][l]) {
                    tempCheck1++;
                }
                start = !start;
            }
            start = !start;
        }

        return Math.min(tempCheck1,64-tempCheck1);
    }
}
