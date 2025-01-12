package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1389 {
    //케빈 베이컨의 6단계 법칙
    static int mem, rel;
    static int[][] relMap;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        mem = Integer.parseInt(tk.nextToken());
        rel = Integer.parseInt(tk.nextToken());
        relMap = new int[mem + 1][mem + 1];
        for (int i = 1; i <= mem; i++) {
            for (int j = 1; j <= mem; j++) {
                if (i != j) {
                    relMap[i][j] = Integer.MAX_VALUE/2;
                }
            }
        }
        for (int i = 0; i < rel; i++) {
            tk = new StringTokenizer(reader.readLine());
            int fir = Integer.parseInt(tk.nextToken());
            int sec = Integer.parseInt(tk.nextToken());
            relMap[fir][sec] = 1;
            relMap[sec][fir] = 1;
        }
        System.out.println(allCheck());
    }

    static int allCheck() {
        for (int k = 1; k <= mem; k++) {
            for (int i = 1; i <= mem; i++) {
                for (int j = 1; j <= mem; j++) {
                    if (relMap[i][j] > relMap[i][k] + relMap[k][j]) {
                        relMap[i][j] = relMap[i][k] + relMap[k][j];
                    }
                }
            }
        }

        int res = Integer.MAX_VALUE;
        int idx = -1;

        for (int i = 1; i <= mem; i++) {
            int total = 0;
            for (int j = 1; j <= mem; j++) {
                total += relMap[i][j];
            }

            if (res > total) {
                res = total;
                idx = i;
            }
        }
        return idx;
    }
}
