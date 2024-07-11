package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        int num = Integer.parseInt(tk.nextToken());
        int jinSu = Integer.parseInt(tk.nextToken());

        while(num != 0){
            if (num % jinSu >= 10) {
                sb.append((char) ((num % jinSu) + 55));
            } else {
                sb.append(num%jinSu);
            }
            num /= jinSu;
        }
        System.out.println(sb.reverse());
    }
}
