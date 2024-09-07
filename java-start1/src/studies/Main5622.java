package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int temp = s.charAt(i) - 64;//1~26
            if (temp <= 3) {
                sum += 3;
            } else if (temp <= 6) {
                sum += 4;
            } else if (temp <= 9) {
                sum += 5;
            } else if (temp <= 12) {
                sum += 6;
            } else if (temp <= 15) {
                sum += 7;
            } else if (temp <= 19) {
                sum += 8;
            } else if (temp <= 22) {
                sum += 9;
            } else if (temp <= 26) {
                sum += 10;
            }
        }
        System.out.println(sum);
    }
}
