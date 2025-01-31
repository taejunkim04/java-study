package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main5073 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk;
        StringBuilder sb = new StringBuilder();
        int[] values = new int[3];
        while (true) {
            tk = new StringTokenizer(reader.readLine());
            for (int i = 0; i < 3; i++) {
                values[i] = Integer.parseInt(tk.nextToken());
            }
            if (values[0] == 0) {
                break;
            }
            Arrays.sort(values);
            if (values[2] >= values[0] + values[1]) {
                sb.append("Invalid").append("\n");
                continue;
            }
            if (values[0] != values[1] && values[1] != values[2]) {
                sb.append("Scalene").append("\n");
            } else if (values[0] == values[1] && values[1] == values[2]) {
                sb.append("Equilateral").append("\n");
            } else {
                sb.append("Isosceles").append("\n");
            }
        }
        System.out.println(sb);
    }
}
