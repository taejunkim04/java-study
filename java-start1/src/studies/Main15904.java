package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main15904 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        String s = reader.readLine();
        char[] ucpc = {'U', 'C', 'P', 'C'};
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ucpc[count]) {
                count++;
                if (count == 4) {
                    break;
                }
            }
        }

        if (count == 4) {
            System.out.println("I love UCPC");
        } else {
            System.out.println("I hate UCPC");
        }
    }
}
