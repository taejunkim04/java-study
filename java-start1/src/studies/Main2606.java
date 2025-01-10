package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main2606 {
    public static boolean[] bioCom;
    public static int[][] arr;
    public static int count = 0;
    public static int node, line;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        node = Integer.parseInt(reader.readLine());
        line = Integer.parseInt(reader.readLine());
        bioCom = new boolean[node + 1];
        arr = new int[node + 1][node + 1];

        for (int i = 0; i < line; i++) {
            StringTokenizer tk = new StringTokenizer(reader.readLine());
            int x = Integer.parseInt(tk.nextToken());
            int y = Integer.parseInt(tk.nextToken());
            arr[x][y] = arr[y][x] = 1;
        }
        like(1);

        System.out.println(count - 1);
    }

    public static void like(int start) {
        bioCom[start] = true;
        count++;
        for (int i = 0; i <= node; i++) {
            if (arr[start][i] == 1 && !bioCom[i]) {
                like(i);
            }
        }
    }
}
