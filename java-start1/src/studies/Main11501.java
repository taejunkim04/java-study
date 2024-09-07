package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main11501 {
    //주식 하나를 산다.
    //원하는 만큼 가지고 있는 주식을 판다.
    //아무것도 안한다.
    private static long sum = 0;
    private static int[] values;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int case1 = Integer.parseInt(reader.readLine());
        for (int i = 0; i < case1; i++) {
            int day = Integer.parseInt(reader.readLine());
            values = new int[day];
            StringTokenizer tk = new StringTokenizer(reader.readLine());
            for (int j = 0; j < day; j++) {
                values[j] = Integer.parseInt(tk.nextToken());
            }

            ju(day);
            System.out.println(sum);
            sum = 0;
        }
    }

    private static void ju(int full) {
        long maxValue = 0;

        for (int i = full - 1; i >= 0; i--) {
            if (values[i] > maxValue) {
                maxValue = values[i];
            } else {
                sum += maxValue - values[i];
            }
        }
    }
}
