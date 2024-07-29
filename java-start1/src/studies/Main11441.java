package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main11441 {
    public static int[] values;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int valueCount = Integer.parseInt(reader.readLine());
        values = new int[valueCount + 1];
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        values[0] = 0;
        for (int i = 1; i <= valueCount; i++) {
            values[i] = Integer.parseInt(tk.nextToken()) + values[i - 1];
        }

        int barr = Integer.parseInt(reader.readLine());
        for (int i = 0; i < barr; i++) {
            tk = new StringTokenizer(reader.readLine());
            int startPoint = Integer.parseInt(tk.nextToken());
            int temp = values[Integer.parseInt(tk.nextToken())] - values[startPoint - 1];
            sb.append(temp).append("\n");
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }
}
