package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1100 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        boolean white = true;
        for (int i = 0; i < 8; i++) {
            String s = reader.readLine();
            for (int j = 0; j < s.length(); j++) {
                if (white) {
                    if (s.charAt(j) == 'F') {
                        count++;
                    }
                }
                white = !white;
            }
            white = !white;
        }
        System.out.println(count);
    }
}
