package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2748 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long value1 = 0;
        long value2 = 1;
        int count = 1;
        int temp = Integer.parseInt(reader.readLine());
        while (count < temp - 1) {
            long tempSum = value1 + value2;
            value1 = value2;
            value2 = tempSum;
            count++;
        }
        long resultValue = value1 + value2;
        System.out.println(resultValue);
    }
}
