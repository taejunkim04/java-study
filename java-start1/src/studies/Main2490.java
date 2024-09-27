package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2490 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        for (int j = 0; j < 3; j++) {
            String s = reader.readLine();
            for (int i = 0; i < 7; i += 2) {
                if (s.charAt(i) == '1') {
                    sum++;
                }
            }
            if (sum == 4) {
                System.out.println("E");
            } else if (sum == 3) {
                System.out.println("A");
            } else if (sum == 2) {
                System.out.println("B");
            } else if (sum == 1) {
                System.out.println("C");
            } else {
                System.out.println("D");
            }
            sum = 0;
        }
    }
}
