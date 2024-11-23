package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int temp = Integer.parseInt(reader.readLine());
        boolean turn = false;
        int maxValue = temp * 2 - 1;
        int plus = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < maxValue; i++) {
            for (int j = 0; j < (maxValue - plus) / 2; j++) {
                sb.append(" ");
            }
            for (int j = 0; j < plus; j++) {
                sb.append("*");
            }
            if (turn) {
                plus -= 2;
            } else {
                plus += 2;
            }
            if (plus == maxValue) {
                turn = true;
            }
            sb.append("\n");
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }
}
