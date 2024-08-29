package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main4375 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s;

        while ((s = reader.readLine()) != null) {
            int inValue = Integer.parseInt(s);
            int num = 1;
            int count = 1;
            while (num % inValue != 0) {
                num = (num * 10 + 1)%inValue;
                count++;
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}
