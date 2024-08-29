package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main1449 {
    public static int[] values;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        int point = Integer.parseInt(tk.nextToken());
        int length = Integer.parseInt(tk.nextToken());

        values = new int[point];
        tk = new StringTokenizer(reader.readLine());
        for (int i = 0; i < point; i++) {
            values[i] = Integer.parseInt(tk.nextToken());
        }
        Arrays.sort(values);

        int count = 1;
        int savePoint = values[0] + length;

        for (int i = 1; i < point; i++) {
            if (values[i] >= savePoint) {
                savePoint = values[i] + length;
                count++;
            }
        }

        System.out.println(count);
    }
}
