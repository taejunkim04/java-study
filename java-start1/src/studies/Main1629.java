package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1629 {
    //곱셈
    static long c;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        long a = Long.parseLong(tk.nextToken());
        long b = Long.parseLong(tk.nextToken());
        c = Long.parseLong(tk.nextToken());

        System.out.println(pow(a, b));
    }

    static long pow(long A, long b) {
        if (b == 1) {
            return A % c;
        }
        long temp = pow(A, b / 2);
        if (b % 2 == 1) {
            return (temp * temp % c) * A % c;
        }
        return temp * temp % c;
    }
}
