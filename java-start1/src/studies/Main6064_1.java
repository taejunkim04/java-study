package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main6064_1 {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int caseNum = Integer.parseInt(reader.readLine());
        for (int i = 0; i < caseNum; i++) {
            StringTokenizer tk = new StringTokenizer(reader.readLine());
            caDate(Integer.parseInt(tk.nextToken()), Integer.parseInt(tk.nextToken()), Integer.parseInt(tk.nextToken())-1, Integer.parseInt(tk.nextToken())-1);
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb.toString());
    }

    public static void caDate(int m, int n, int x, int y) {
        int answer = -1;

        for (int i = x; i < n * m; i += m) {
            if (i % n == y) {
                answer = i + 1;
                break;
            }
        }
        sb.append(answer).append("\n");
    }
}
