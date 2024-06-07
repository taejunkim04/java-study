package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        boolean[][] paper = new boolean[100][100];
        int value = 0;
        for (int i = 0; i < count; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int ga = Integer.parseInt(tokenizer.nextToken());
            int se = Integer.parseInt(tokenizer.nextToken());
            for (int x = ga; x < ga + 10; x++) {
                for (int y = se; y < se + 10; y++) {
                    paper[x][y] = true;
                }
            }
        }
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (paper[i][j]) {
                    value++;
                }
            }
        }
        System.out.println(value);
    }
}
