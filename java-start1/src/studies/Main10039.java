package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10039 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int temp = 0;
        for (int i = 0; i < 5; i++) {
            temp = Integer.parseInt(reader.readLine());
            if (temp < 40) {
                temp = 40;
            }
            sum += temp;
        }
        sum /= 5;
        System.out.println(sum);
    }
}
