package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2475 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int temp = Integer.parseInt(tk.nextToken());
            sum += temp * temp;
        }
        System.out.println(sum % 10);
    }
}
