package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1138 {
    public static int[] values;
    public static boolean[] check;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(reader.readLine());

        StringTokenizer tk = new StringTokenizer(reader.readLine());
        values = new int[count];
        check = new boolean[count];
        for (int i = 1; i <= count; i++) {
            int temp = Integer.parseInt(tk.nextToken());
            point(i, temp, 0);
        }

        for (int value : values) {
            sb.append(value).append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }

    public static void point(int value, int jump,int pointer) {
        if (jump == 0) {
            if (!check[pointer]) {
                check[pointer] = true;
                values[pointer] = value;
            } else {
                while (check[pointer]) {
                    pointer++;
                }
                check[pointer] = true;
                values[pointer] = value;
            }
        } else {
            if (!check[pointer]) {
                point(value, jump - 1, pointer + 1);
            } else {
                point(value, jump, pointer + 1);
            }
        }
    }
}
