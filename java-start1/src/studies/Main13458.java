package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main13458 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int room = Integer.parseInt(reader.readLine());

        int[] eachPer = new int[room];
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        for (int i = 0; i < room; i++) {
            eachPer[i] = Integer.parseInt(tk.nextToken());
        }
        tk = new StringTokenizer(reader.readLine());
        int mainG = Integer.parseInt(tk.nextToken());
        int suvG = Integer.parseInt(tk.nextToken());

        long res = 0;
        for (int i = 0; i < room; i++) {
            int temp = eachPer[i] - mainG;
            if (temp > 0) {
                if (temp % suvG == 0) {
                    res += temp / suvG;
                } else {
                    res += temp / suvG + 1;
                }
            }
            res++;
        }
        System.out.println(res);
    }
}
