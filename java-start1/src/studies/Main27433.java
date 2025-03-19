package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main27433 {
    //팩토리얼2
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        if (n == 0) {
            System.out.println(1);
        } else {
            long res = 1;
            for (int i = 2; i <= n; i++) {
                res *= i;
            }
            System.out.println(res);
        }
    }
}
