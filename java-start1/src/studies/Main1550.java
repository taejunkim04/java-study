package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1550 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int res = 0;
        int loc = 1;
        for (int i = 1; i < s.length(); i++) {
            loc *= 16;
        }
        for (int i = 0; i < s.length(); i++) {
            int temp;
            if (s.charAt(i) <= 57) {
                temp = s.charAt(i) - 48;
            } else {
                temp = s.charAt(i) - 55;
            }
            res += loc * temp;
            loc /= 16;
        }
        System.out.println(res);
    }

}
