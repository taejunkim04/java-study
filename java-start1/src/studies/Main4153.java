package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main4153 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] values = new int[3];
        while (true) {
            StringTokenizer tk = new StringTokenizer(reader.readLine());
            values[0] = Integer.parseInt(tk.nextToken());
            values[1] = Integer.parseInt(tk.nextToken());
            values[2] = Integer.parseInt(tk.nextToken());
            if (values[0] == 0) {
                break;
            }
            Arrays.sort(values);
            if (values[0] * values[0] + values[1] * values[1] == values[2] * values[2]) {
                sb.append("right\n");
            } else {
                sb.append("wrong\n");
            }
        }
        System.out.println(sb);
    }
}
