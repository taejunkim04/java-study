package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main1271 {
    //엄청난 부자2

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        BigInteger n = new BigInteger(tk.nextToken());
        BigInteger m = new BigInteger(tk.nextToken());

        System.out.println(n.divide(m));
        System.out.println(n.remainder(m));
    }

}
