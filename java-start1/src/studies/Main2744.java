package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2744 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = reader.readLine();

        for (int i = 0; i < s.length(); i++) {
            int temp = (int)s.charAt(i);
            if (temp > 90) {
                char low = (char) (temp - 32);
                sb.append(low);
            } else {
                char upp = (char) (temp + 32);
                sb.append(upp);
            }
        }
        System.out.println(sb);
    }
}
