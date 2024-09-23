package other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class operatingFifo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sours = 5;
        int[] arrived = new int[sours];
        int[] runtimes = new int[sours];
        boolean[] arrCheck = new boolean[sours];
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        for (int i = 0; i < sours; i++) {
            arrived[i] = Integer.parseInt(tk.nextToken());
        }
        tk = new StringTokenizer(reader.readLine());
        for (int i = 0; i < sours; i++) {
            runtimes[i] = Integer.parseInt(tk.nextToken());
        }
        double sum = 0;
        int time = 0;
        int small = 10000;
        int point = 100;
        for (int j = 0; j < sours; j++) {
            for (int i = 0; i < sours; i++) {
                if (arrived[i] < small && !arrCheck[i]) {
                    small = arrived[i];
                    point = i;
                }
            }
            arrCheck[point] = true;
            time += runtimes[point];
            sum += time - arrived[point];
            small = 10000;
        }
        sum /= sours;
        System.out.println(sum);

    }
}
