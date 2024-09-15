package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1388 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(tk.nextToken());
        int m = Integer.parseInt(tk.nextToken());

        boolean[][] values = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            String s = reader.readLine();
            for (int j = 0; j < m; j++) {
                if (s.charAt(j) == '-') {
                    values[i][j] = true;
                }
            }
        }
        int sum = 0;
        boolean check = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (values[i][j]) {
                    if (!check) {
                        check = true;
                        sum++;
                    }
                } else {
                    check = false;
                }
            }
            check = false;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!values[j][i]) {
                    if (!check) {
                        check = true;
                        sum++;
                    }
                } else {
                    check = false;
                }
            }
            check = false;
        }
        System.out.println(sum);
    }

}
