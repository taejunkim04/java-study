package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main4796 {
    public static int[] values;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = 1;
        while (true) {
            StringTokenizer tk = new StringTokenizer(reader.readLine());
            int run = Integer.parseInt(tk.nextToken());
            if (run == 0) {
                break;
            }
            int length = Integer.parseInt(tk.nextToken());
            int vacation = Integer.parseInt(tk.nextToken());
            int sleep = 0;
            while (vacation > 0) {
                if (vacation >= length) {
                    vacation -= length;
                    sleep += run;
                } else {
                    if (vacation >= run) {
                        sleep += run;
                        vacation = 0;
                    } else {
                        sleep += vacation;
                        vacation = 0;
                    }
                }
            }
            sb.append("Case " + count + ": ").append(sleep).append("\n");
            count++;
        }
        System.out.println(sb);
    }
}
