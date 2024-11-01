package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1459 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        int x = Integer.parseInt(tk.nextToken());
        int y = Integer.parseInt(tk.nextToken());
        int str = Integer.parseInt(tk.nextToken());
        int cro = Integer.parseInt(tk.nextToken());

        long moveCro = Math.min(str * 2, cro);
        long strTwo = Math.min(str * 2, cro * 2);

        long result = 0;
        long temp = Math.min(x, y);
        x -= temp;
        y -= temp;
        result += moveCro * temp;
        if (x == 0) {
            if (y % 2 == 0) {
                result += strTwo * (y / 2);
            } else {
                result += strTwo * ((y-1) / 2);
                result += str;
            }
        } else {
            if (x % 2 == 0) {
                result += strTwo * (x / 2);
            } else {
                result += strTwo * ((x-1) / 2);
                result += str;
            }
        }
        System.out.println(result);
    }
}
