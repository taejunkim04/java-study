package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main11948 {
    public static int[] values1 = new int[4];
    public static int[] values2 = new int[2];
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 4; i++) {
            values1[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < 2; i++) {
            values2[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(values1);
        Arrays.sort(values2);

        int sum = 0;
        for (int i = 3; i > 0; i--) {
            sum += values1[i];
        }
        sum += values2[1];
        System.out.println(sum);
    }
}
