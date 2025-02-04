package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main11724 {
    static boolean[][] values;
    static boolean[] visited;
    static int newVisitedCount = 0;
    static int node;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        node = Integer.parseInt(tk.nextToken());
        int connect = Integer.parseInt(tk.nextToken());

        values = new boolean[node + 1][node + 1];
        visited = new boolean[node + 1];

        for (int i = 0; i < connect; i++) {
            tk = new StringTokenizer(reader.readLine());
            int node1 = Integer.parseInt(tk.nextToken());
            int node2 = Integer.parseInt(tk.nextToken());
            values[node2][node1] = values[node1][node2] = true;
        }
        for (int i = 1; i <= node; i++) {
            if (!visited[i]) {
                newVisitedCount++;
                dfs(i);
            }
        }
        System.out.println(newVisitedCount);
    }

    static void dfs(int cur) {
        if (visited[cur]) {
            return;
        }
        visited[cur] = true;
        for (int i = 1; i <= node; i++) {
            if (values[cur][i]) {
                dfs(i);
            }
        }
    }
}
