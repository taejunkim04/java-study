package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10974 {
    public static StringBuilder sb = new StringBuilder();
    public static int[] value;
    public static int num;
    public static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(reader.readLine());
        value = new int[num];
        visited = new boolean[num];

        suTen(0);
        System.out.println(sb.toString());
    }

    public static void suTen(int depth) {
        if (depth == num) {
            for (int i : value) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i = 0; i < num; i++) {
            if (visited[i]) {
                continue;
            }
            value[depth] = i + 1;
            visited[i] = true;
            suTen(depth + 1);
            visited[i] = false;
        }
    }

}
