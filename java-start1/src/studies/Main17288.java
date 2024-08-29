package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main17288 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int count = 0;
        int temp = 0;
        int lastNum = 0;

        for (int i = 0; i < s.length(); i++) {
            int tempInt = s.charAt(i);
            if (lastNum + 1 == tempInt) {
                temp++;
                if (i == s.length() - 1) {
                    if (temp == 2) {
                        count++;
                    }
                }
            } else {
                if (temp == 2) {
                    count++;
                }
                temp = 0;
            }
            lastNum = tempInt;
        }
        System.out.println(count);
    }
}
