package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main6378 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String natNum = reader.readLine();
            if (natNum.equals("0")) {
                break;
            }
            int sum = 0;
            for (int i = 0; i < natNum.length(); i++) {
                char temp = natNum.charAt(i);
                sum += (int) temp - 48;
            }

            if (sum < 10) {
                sb.append(sum).append("\n");
            } else {
                while (sum >= 10) {
                    sum = di(sum);
                }
                sb.append(sum).append("\n");
            }
        }
        System.out.println(sb);
    }

    public static int di(int value) {
        int temp = 0;
        while (value > 0) {
            temp += value % 10;
            value /= 10;
        }
        return temp;
    }
}
