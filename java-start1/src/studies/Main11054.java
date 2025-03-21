package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main11054 {
    //가장 긴 바이토닉 부분 수열
    static int length, resNum = 0;
    static int[] values,ups, downs;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        length = Integer.parseInt(reader.readLine());
        values = new int[length];
        ups = new int[length];
        downs = new int[length];
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        for (int i = 0; i < length; i++) {
            values[i] = Integer.parseInt(tk.nextToken());
            ups[i] = downs[i] = 1;
        }

        for (int i = 1; i < length; i++) {
            for (int j = 0; j < i; j++) {
                if (values[i] > values[j]) {
                    ups[i] = Math.max(ups[i], ups[j] + 1);
                }
            }
        }

        for (int i = length - 2; i >= 0; i--) {
            for (int j = length - 1; j > i; j--) {
                if (values[i] > values[j]) {
                    downs[i] = Math.max(downs[i], downs[j] + 1);
                }
            }
        }

        for (int i = 0; i < length; i++) {
            if (ups[i] + downs[i] > resNum) {
                resNum = ups[i] + downs[i];
            }
        }
        System.out.println(resNum - 1);
    }
}
