package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main15656 {
    public static StringBuilder sb;//출력형태
    public static int n, m;//n과m
    public static int[] values;//제시되는 값을 담을배열
    public static int[] soutArray;//출력을 위해 임시로 사용하는 배열
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        sb = new StringBuilder();
        n = Integer.parseInt(tk.nextToken());
        m = Integer.parseInt(tk.nextToken());
        tk = new StringTokenizer(reader.readLine());
        values = new int[n];
        int temp = 0;
        while (tk.countTokens() != 0) {
            values[temp] = Integer.parseInt(tk.nextToken());
            temp++;
        }
        Arrays.sort(values);
        soutArray = new int[m];

        res(0);
        System.out.println(sb);
    }

    public static void res(int depth) {
        if (depth == m) {
            for (int i : soutArray) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i = 0; i < values.length; i++) {
            soutArray[depth] = values[i];
            res(depth+1);
        }
    }
}
