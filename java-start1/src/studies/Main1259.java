package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        while (!s.equals("0")) {
            fal(s);
            s = reader.readLine();
        }
    }

    static void fal(String s) {
        boolean result = true;
        int temp = s.length() - 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(temp)) {
                result = false;
                break;
            }
            temp--;
        }
        if (result) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
