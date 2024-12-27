package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main9461 {
    static long[] values = new long[100];
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(reader.readLine());
        StringBuilder sb = new StringBuilder();
        values[0] = 1;
        values[1] = 1;
        values[2] = 1;
        for (int i = 3; i < 100; i++) {
            values[i] = values[i - 2] + values[i - 3];
        }
        for (int i = 0; i < testCase; i++) {
            int num = Integer.parseInt(reader.readLine());
            sb.append(values[num - 1] + "\n");
        }
        System.out.println(sb);
    }
}
