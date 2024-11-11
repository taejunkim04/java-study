package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main3036 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int caseCou = Integer.parseInt(reader.readLine());
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        StringBuilder sb = new StringBuilder();
        int startNum = Integer.parseInt(tk.nextToken());
        for (int i = 1; i < caseCou; i++) {
            int next = Integer.parseInt(tk.nextToken());
            int maxNum = gcd(startNum, next);
            sb.append(startNum / maxNum + "/" + next / maxNum).append("\n");
        }
        System.out.println(sb);
    }
    static int gcd(int a, int b) {
        int temp;
        while (b != 0) {
            temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    };
}


