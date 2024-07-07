package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1085 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        int x = Integer.parseInt(tk.nextToken());
        int y = Integer.parseInt(tk.nextToken());
        int w = Integer.parseInt(tk.nextToken());
        int h = Integer.parseInt(tk.nextToken());
        int result = 10000;
        if (w - x < result) {
            result = w - x;
        }
        if (h - y < result) {
            result = h - y;
        }
        if (x < result) {
            result = x;
        }
        if (y < result) {
            result = y;
        }
        System.out.println(result);
    }
}
