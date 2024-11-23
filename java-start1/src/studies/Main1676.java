package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int value = Integer.parseInt(reader.readLine());

        int count = 0;
        for (int i = 1; i <= value; i++) {
            int temp = i;
            while (temp % 5 == 0) {
                count++;
                temp /= 5;
            }
        }
        System.out.println(count);
    }
}
