package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main11576 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        StringBuilder sb = new StringBuilder();
        int jin1 = Integer.parseInt(tk.nextToken());
        int jin2 = Integer.parseInt(tk.nextToken());

        int length = Integer.parseInt(reader.readLine());
        tk = new StringTokenizer(reader.readLine());
        long sum = 0;
        long temp = 1;
        for (int i = 1; i < length; i++) {
            temp *= jin1;
        }

        for (int i = 0; i < length; i++) {
            sum += temp * Integer.parseInt(tk.nextToken());
            temp /= jin1;
        }//값을 구한다.

        temp = 1;
        while (sum > temp) {
            temp *= jin2;
        }
        temp /= jin2;
        //자릿수 설정

        while (true) {
            for (int i = jin2 - 1; i >= 0; i--) {
                if (sum - temp * i >= 0) {
                    sb.append(i).append(" ");
                    sum -= temp * i;
                    break;
                }
            }
            if (temp == 1) {
                System.out.println(sb);
                break;
            }
            temp /= jin2;
        }
    }
}
