package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main2752 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] values = new int[3];
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        for (int i = 0; i < 3; i++) {
            values[i] = Integer.parseInt(tk.nextToken());
        }
        Arrays.sort(values);
        for (int value : values) {
            System.out.print(value + " ");
        }
    }
}
