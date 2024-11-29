package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2576 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean notOdd = true;
        int res = 0;
        int min = 100;
        for (int i = 0; i < 7; i++) {
            int temp = Integer.parseInt(reader.readLine());
            if (temp % 2 != 0) {
                res += temp;
                notOdd = false;
                if (temp < min) {
                    min = temp;
                }
            }
        }
        if (notOdd) {
            System.out.println(-1);
        } else {
            System.out.println(res);
            System.out.println(min);
        }
    }
}
