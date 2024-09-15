package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main9237 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        int[] values = new int[count];
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        for (int i = 0; i < count; i++) {
            values[i] = Integer.parseInt(tk.nextToken());
        }
        Arrays.sort(values);

        int max = 0;
        int day = 1;
        for (int i = count - 1; i >= 0; i--) {
            int temp = values[i]+day;
            if (temp > max) {
                max = temp;
            }
            day++;
        }
        max++;
        System.out.println(max);
    }

}
