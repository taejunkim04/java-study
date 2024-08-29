package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main2217 {
    public static int[] values;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int inCount = Integer.parseInt(reader.readLine());
        values = new int[inCount];
        for (int i = 0; i < inCount; i++) {
            values[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(values);
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < inCount; i++) {
            maxValue = Math.max(maxValue, values[i] * (inCount - i));
        }
        System.out.println(maxValue);
    }
}
