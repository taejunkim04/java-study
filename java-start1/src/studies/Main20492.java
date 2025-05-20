package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main20492 {
    //세금
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float n = Integer.parseInt(reader.readLine());
        System.out.println((int)(n * 0.78));
        float ma = n * (float) 0.2;
        ma *= (float) 0.22;
        System.out.println((int)(n - ma));
    }
}
