package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main3046 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        int r1 = Integer.parseInt(tk.nextToken());
        int avg = Integer.parseInt(tk.nextToken());
        int r2 = avg * 2 - r1;
        System.out.println(r2);
    }
}
