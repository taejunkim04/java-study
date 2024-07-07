package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1373 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        if (s.length() % 3 == 0) {
            int upValue = 4;
            StringBuilder sb = new StringBuilder();
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    sum += upValue;
                    upValue /= 2;
                } else {
                    upValue /= 2;
                }
                if (upValue < 1) {
                    sb.append(sum);
                    upValue = 4;
                    sum = 0;
                }
            }
            System.out.println(sb);
        } else if (s.length() % 3 == 2) {
            int upValue = 2;
            StringBuilder sb = new StringBuilder();
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    sum += upValue;
                    upValue /= 2;
                } else {
                    upValue /= 2;
                }
                if (upValue < 1) {
                    sb.append(sum);
                    upValue = 4;
                    sum = 0;
                }
            }
            System.out.println(sb);
        } else {
            int upValue = 1;
            StringBuilder sb = new StringBuilder();
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    sum += upValue;
                    upValue /= 2;
                } else {
                    upValue /= 2;
                }
                if (upValue < 1) {
                    sb.append(sum);
                    upValue = 4;
                    sum = 0;
                }
            }
            System.out.println(sb);
        }
    }
}
