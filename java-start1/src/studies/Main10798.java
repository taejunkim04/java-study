package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] words = new String[5];
        for (int i = 0; i < 5; i++) {
            words[i] = reader.readLine();
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 15; i++) {
            for (int ii = 0; ii < 5; ii++) {
                if (words[ii].length() > i) {
                    sb.append(words[ii].charAt(i));
                }
            }
        }

        System.out.println(sb);
    }
}
