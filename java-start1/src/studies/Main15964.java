package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main15964 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());

        long n = Long.parseLong(tk.nextToken());
        long m = Long.parseLong(tk.nextToken());
        System.out.println((n + m) * (n - m));
    }
}
