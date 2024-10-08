package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main30802 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int peo = Integer.parseInt(reader.readLine());
        int[] values = new int[6];
        StringTokenizer tk = new StringTokenizer(reader.readLine());

        for (int i = 0; i < 6; i++) {
            values[i] = Integer.parseInt(tk.nextToken());
        }
        tk = new StringTokenizer(reader.readLine());
        int cloSet = Integer.parseInt(tk.nextToken());
        int penSet = Integer.parseInt(tk.nextToken());

        int cloCou = 0;
        for(int i = 0; i < 6; i++) {
            cloCou += values[i] / cloSet;
            if(values[i] % cloSet != 0) {
                cloCou++;
            }
        }

        System.out.println(cloCou);
        System.out.println(peo / penSet + " " + peo % penSet);
    }
}
