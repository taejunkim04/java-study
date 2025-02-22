package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main7567 {
    //그릇
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        boolean last = s.charAt(0) == '(';
        int res = 10;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (last) {
                    res += 5;
                } else {
                    last = true;
                    res += 10;
                }
            } else {
                if (!last) {
                    res += 5;
                } else {
                    last = false;
                    res += 10;
                }
            }
        }
        System.out.println(res);
    }
}
