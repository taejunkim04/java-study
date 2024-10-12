package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main10797 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        int res = 0;
        while (tk.countTokens() > 0) {
            int temp = Integer.parseInt(tk.nextToken());
            if (count == temp) {
                res++;
            }
        }
        System.out.println(res);
    }
}
