package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main2693 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(reader.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cases; i++) {
            int[] values = new int[10];
            StringTokenizer tk = new StringTokenizer(reader.readLine());
            for (int j = 0; j < 10; j++) {
                values[j] = Integer.parseInt(tk.nextToken());
            }
            Arrays.sort(values);
            sb.append(values[7]).append("\n");
        }
        System.out.println(sb);
    }
}
