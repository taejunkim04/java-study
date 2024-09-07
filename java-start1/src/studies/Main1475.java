package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] values = new int[10];

        int num = Integer.parseInt(reader.readLine());
        while (num > 0) {
            int temp = num % 10;
            values[temp]++;
            num /= 10;
        }
        int sixOrNine = values[6] + values[9];
        int div;
        if (sixOrNine % 2 == 0) {
            div = sixOrNine / 2;
        } else {
            div = sixOrNine / 2 + 1;
        }
        values[6] = div;
        values[9] = div;
        int set = -1;
        for (int value : values) {
            if (set < value) {
                set = value;
            }
        }
        System.out.println(set);
    }
}
