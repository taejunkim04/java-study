package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1629_2 {
    //곱셈
    static long a,b, c;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        a = Long.parseLong(tk.nextToken());
        b = Long.parseLong(tk.nextToken());
        c = Long.parseLong(tk.nextToken());

        System.out.println(pow(a, b));
    }

    static long pow(long x, long y) {
        if (y == 1) {
            return x % y;
        }
        long res = pow(x, y / 2);
        if (y % 2 == 1) {
            return (res * res % c) * x % c;
        }
        return res * res % c;
    }
}
