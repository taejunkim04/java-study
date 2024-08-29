package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main16435 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        int count = Integer.parseInt(tk.nextToken());
        int length = Integer.parseInt(tk.nextToken());
        int[] values = new int[count];
        tk = new StringTokenizer(reader.readLine());
        for (int i = 0; i < count; i++) {
            values[i] = Integer.parseInt(tk.nextToken());
        }
        Arrays.sort(values);

        for (int value : values) {
            if (value <= length) {
                length++;
            } else {
                break;
            }
        }
        System.out.println(length);
    }
}
