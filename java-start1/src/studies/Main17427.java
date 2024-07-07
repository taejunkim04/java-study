package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main17427 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        long result = 0;
        long[] gArray = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j += i) {
                gArray[j] += i;
            }
        }//배수에 해당하는 값에 값을 넣어 약수들 더하여 배열화
        for (long l : gArray) {
            result += l;
        }//f(x)들을 더해 g(x)로
        System.out.println(result);
    }
}
