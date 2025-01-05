package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        StringTokenizer tk = new StringTokenizer(s, "+-");
        boolean check = true;
        int miCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (temp == '+' || temp == '-') {
                miCount++;
                if (temp == '-') {
                    check = false;
                    break;
                }
            }
        }
        int result = 0;
        int count = 0;
        if (check) {
            while (tk.hasMoreTokens()) {
                result += Integer.parseInt(tk.nextToken());
            }
        }
        while (tk.hasMoreTokens()) {
            if (count >= miCount) {
                result -= Integer.parseInt(tk.nextToken());
            } else {
                result += Integer.parseInt(tk.nextToken());
                count++;
            }
        }
        System.out.println(result);
    }
}
