package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main15829 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int caseCount = Integer.parseInt(reader.readLine());
        String s= reader.readLine();
        int prime = 1234567891;
        long r = 1;
        long sum = 0;

        for (int i = 0; i < caseCount; i++) {
            sum += ((s.charAt(i) - 'a' + 1) * r) % prime;
            r = (r * 31) % prime;
        }
        System.out.println(sum % prime);
    }
}
