package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1389_2 {
    static int[][] map;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        int userCou = Integer.parseInt(tk.nextToken());
        int relationCou = Integer.parseInt(tk.nextToken());
        map = new int[userCou + 1][userCou + 1];
        for (int i = 0; i <= userCou; i++) {
            for (int j = 0; j <= userCou; j++) {
                map[i][j] = 100000000;
            }
        }
        for (int i = 0; i < relationCou; i++) {
            tk = new StringTokenizer(reader.readLine());
            int rel1 = Integer.parseInt(tk.nextToken());
            int rel2 = Integer.parseInt(tk.nextToken());
            map[rel2][rel1] = map[rel1][rel2] = 1;
        }
        for (int i = 1; i <= userCou; i++) {
            for (int j = 1; j <= userCou; j++) {
                for (int k = 1; k <= userCou; k++) {
                    if (map[j][k] > map[j][i] + map[i][k]) {
                        map[j][k] = map[j][i] + map[i][k];
                    }
                }
            }
        }
        int smallRel = Integer.MAX_VALUE;
        int who = -1;
        for (int i = 1; i <= userCou; i++) {
            int sum = 0;
            for (int j = 1; j <= userCou; j++) {
                if (i != j) {
                    sum += map[i][j];
                }
            }
            if (sum < smallRel) {
                who = i;
                smallRel = sum;
            }
        }
        System.out.println(who);
    }
}
