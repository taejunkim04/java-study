package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main5554 {
    //심부름 가는 길
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] values = new int[4];
        for (int i = 0; i < 4; i++) {
            values[i] = Integer.parseInt(reader.readLine());
        }
        int res = 0;
        for (int value : values) {
            res += value;
        }
        System.out.println(res / 60);
        System.out.println(res % 60);
    }
}
