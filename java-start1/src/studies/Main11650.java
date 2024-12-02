package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int caseCou = Integer.parseInt(reader.readLine());

        int[][] values = new int[caseCou][2];
        StringTokenizer tk;
        for (int i = 0; i < caseCou; i++) {
            tk = new StringTokenizer(reader.readLine());
            values[i][0] = Integer.parseInt(tk.nextToken());
            values[i][1] = Integer.parseInt(tk.nextToken());
        }
        Arrays.sort(values, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                } else {
                    return o1[0] - o2[0];
                }

            }
        });
        StringBuilder sb = new StringBuilder();
        for (int[] value : values) {
            sb.append(value[0]).append(" ").append(value[1]).append("\n");
        }
        System.out.println(sb);
    }
}
