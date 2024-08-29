package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10162 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int value = Integer.parseInt(reader.readLine());
        StringBuilder sb = new StringBuilder();
        if (value % 10 == 0) {
            int count;
            if (value >= 300) {
                count = value / 300;
                sb.append(count).append(" ");
                value = value % 300;
            } else {
                sb.append(0).append(" ");
            }

            if (value >= 60) {
                count = value / 60;
                sb.append(count).append(" ");
                value = value % 60;
            } else {
                sb.append(0).append(" ");
            }
            if (value >= 10) {
                count = value / 10;
                sb.append(count);
            } else {
                sb.append(0);
            }
            System.out.println(sb);
        } else {
            System.out.println(-1);
        }
    }
}
