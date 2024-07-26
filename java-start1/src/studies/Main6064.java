package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main6064 {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int caseNum = Integer.parseInt(reader.readLine());
        for (int i = 0; i < caseNum; i++) {
            StringTokenizer tk = new StringTokenizer(reader.readLine());
            caDate(Integer.parseInt(tk.nextToken()), Integer.parseInt(tk.nextToken()), Integer.parseInt(tk.nextToken()), Integer.parseInt(tk.nextToken()));
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb.toString());
    }

    public static void caDate(int n, int m, int x, int y) {
        int temp = 0;

        for (int i = 1; ; i++) {
            if ((m * i) % n == 0) {
                temp = m * i;
                break;
            }
        }
        for (int i = x; i <= temp; i += n) {
            if ((i - y) % m == 0) {
                sb.append(i).append("\n");
                return;
            }
        }
        sb.append(-1).append("\n");
    }
}
