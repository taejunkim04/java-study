package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main14916 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int value = Integer.parseInt(reader.readLine());
        int count = 0;

        while (value > 0) {
            if (value % 5 == 0) {
                count += value / 5;
                System.out.println(count);
                return;
            } else {
                value -= 2;
                count++;
            }
        }
        if (value < 0) {
            System.out.println(-1);
        } else {
            System.out.println(count);
        }
    }
}
