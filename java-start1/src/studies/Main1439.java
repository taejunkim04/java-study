package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1439 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] zero_one = new int[2];
        String s = reader.readLine();
        char last = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            if (last == s.charAt(i)) {

            } else if (s.charAt(i) == '0') {
                zero_one[1]++;
                last = '0';
            } else {
                zero_one[0]++;
                last = '1';
            }
        }
        if (last == '0') {
            zero_one[0]++;
        } else {
            zero_one[1]++;
        }

        if (s.length() == 1) {
            System.out.println(0);
        } else {
            int temp = Math.min(zero_one[0], zero_one[1]);
            System.out.println(temp);
        }
    }
}
