package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main15059 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] values = new int[3];
        int res = 0;
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        for (int i = 0; i < 3; i++) {
            values[i] = Integer.parseInt(tk.nextToken());
        }
        tk = new StringTokenizer(reader.readLine());
        for (int i = 0; i < 3; i++) {
            int temp = Integer.parseInt(tk.nextToken());
            if (values[i] < temp) {
                res += temp - values[i];
            }
        }
        System.out.println(res);
    }
}
