package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main1417 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(reader.readLine());
        if (cases == 1) {
            System.out.println(0);
            return;
        }
        int[] values = new int[cases-1];
        int num1 = Integer.parseInt(reader.readLine());

        for (int i = 0; i < cases - 1; i++) {
            int temp = Integer.parseInt(reader.readLine());
            if (num1 <= temp) {
                values[i] = temp;
            }
        }
        Arrays.sort(values);

        int count = 0;
        boolean winner = false;

        while (true) {
            for (int i = values.length - 1; i >= 0; i--) {
                if (num1 <= values[i]) {
                    break;
                }

                if (i == 0) {
                    winner = true;
                }
            }
            if (winner) {
                break;
            }
            for (int i = values.length - 1; i >= 0; i--) {
                if (num1 <= values[i]) {
                    num1++;
                    values[i]--;
                    count++;
                    Arrays.sort(values);
                    break;
                }
            }
        }

        System.out.println(count);
    }
}
