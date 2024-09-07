package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main19941 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(tk.nextToken());
        int m = Integer.parseInt(tk.nextToken());

        String s = reader.readLine();
        int[] table = new int[n];
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'H') {
                table[i] = 1;//햄버거는 1
            } else {
                table[i] = 2;//사람은 2
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (table[i] == 2) {
                for (int j = -m; j <= m; j++) {
                    if (j != 0 && i + j >= 0 && i + j < n) {
                        if (table[i + j] == 1) {
                            table[i + j] = 0;
                            count++;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
