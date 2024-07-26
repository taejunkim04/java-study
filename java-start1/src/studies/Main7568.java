package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        StringBuilder sb = new StringBuilder();
        int[][] peoples = new int[count][2];

        for (int i = 0; i < count; i++) {
            StringTokenizer tk = new StringTokenizer(reader.readLine());
            peoples[i][0] = Integer.parseInt(tk.nextToken());
            peoples[i][1] = Integer.parseInt(tk.nextToken());
        }

        for (int i = 0; i < count; i++) {
            int rank = 1;
            for (int j = 0; j < count; j++) {
                if (i == j) {
                    continue;
                }
                if (peoples[i][0] < peoples[j][0] && peoples[i][1] < peoples[j][1]) {
                    rank++;
                }
            }
            sb.append(rank + " ");
        }
        System.out.println(sb);
    }
}
