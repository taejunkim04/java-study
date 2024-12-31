package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main10103 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        StringTokenizer tk;
        int firSco = 100;
        int secSco = 100;
        for (int i = 0; i < n; i++) {
            tk = new StringTokenizer(reader.readLine());
            int fir = Integer.parseInt(tk.nextToken());
            int sec = Integer.parseInt(tk.nextToken());

            if (fir == sec) {

            } else if (fir > sec) {
                secSco -= fir;
            } else {
                firSco -= sec;
            }
        }
        System.out.println(firSco);
        System.out.println(secSco);
    }
}
