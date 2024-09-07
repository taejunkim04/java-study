package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main1051 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(tk.nextToken());
        int m = Integer.parseInt(tk.nextToken());

        int[][] map = new int[n][m];

        for (int i = 0; i < n; i++) {
            String br = reader.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = br.charAt(j) - '0';
            }
        }

        int len = Math.min(n, m);

        while (len > 1) {
            for(int i=0; i<= n-len; i++) {
                for(int j=0; j<=m-len; j++) {
                    int num = map[i][j];
                    // 꼭짓점 3군데 비교
                    if(num==map[i][j+len-1] && num == map[i+len-1][j] && num == map[i+len-1][j+len-1]) {
                        System.out.println(len*len);
                        return;
                    }
                }
            }
            len--;
        }
        System.out.println(len*len);
    }
}
