package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 10 == 0) {
                if (i != 0) {
                    sb.append("\n");
                }
            }
            sb.append(s.charAt(i));
        }
        System.out.println(sb);
    }
}
