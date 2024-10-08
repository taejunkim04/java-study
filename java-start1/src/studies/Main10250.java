package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main10250 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(reader.readLine());
        for (int i = 0; i < count; i++) {
            StringTokenizer tk = new StringTokenizer(reader.readLine());
            int se = Integer.parseInt(tk.nextToken());
            int ga = Integer.parseInt(tk.nextToken());
            int next = Integer.parseInt(tk.nextToken());

            if (next % se == 0) {
                sb.append((se * 100) + (next / se)).append('\n');
            } else {
                sb.append(((next % se) * 100) + ((next / se) + 1)).append('\n');
            }
        }
        System.out.println(sb);
    }
}
