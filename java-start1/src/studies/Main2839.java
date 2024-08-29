package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int kilos = Integer.parseInt(reader.readLine());
        int count = 0;

        while (kilos > 0) {
            if (kilos % 5 == 0) {
                count += kilos / 5;
                break;
            } else {
                kilos -= 3;
                count++;
            }
            if (kilos < 0) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(count);
    }
}
