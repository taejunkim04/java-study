package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main5565 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = Integer.parseInt(reader.readLine());
        for (int i = 0; i < 9; i++) {
            sum -= Integer.parseInt(reader.readLine());
        }
        System.out.println(sum);
    }
}
