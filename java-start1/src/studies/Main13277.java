package studies;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main13277 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BigInteger x = sc.nextBigInteger();
        BigInteger y = sc.nextBigInteger();
        System.out.println(x.multiply(y));
    }
}
