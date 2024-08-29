package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main14215 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        int[] values = new int[3];
        values[0] = Integer.parseInt(tk.nextToken());
        values[1] = Integer.parseInt(tk.nextToken());
        values[2] = Integer.parseInt(tk.nextToken());

        Arrays.sort(values);
        int temp = values[0] + values[1];
        if (temp <= values[2]) {
            values[2] = temp - 1;
        }
        temp = 0;
        for (int value : values) {
            temp += value;
        }
        System.out.println(temp);
    }
}
