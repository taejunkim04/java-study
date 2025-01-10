package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main1260 {
    //DFS와 BFS
    static int n,m,startNum;
    static StringBuilder sb=new StringBuilder();
    static boolean[][] values;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        n = Integer.parseInt(tk.nextToken());
        m = Integer.parseInt(tk.nextToken());
        startNum = Integer.parseInt(tk.nextToken());

        values = new boolean[n][n + 1];
        visited = new boolean[n];
        for (int i = 0; i < m; i++) {
            tk = new StringTokenizer(reader.readLine());
            int bodyValue = Integer.parseInt(tk.nextToken());
            int conectValues = Integer.parseInt(tk.nextToken());
            values[bodyValue-1][conectValues] = true;
            values[conectValues - 1][bodyValue] = true;
        }

        dfs(startNum);
        sb.append("\n");
        visited = new boolean[n];
        bfs(startNum);
        System.out.println(sb);
    }


    static void dfs(int cur) {
        if (!visited[cur - 1]) {
            visited[cur - 1] = true;
            sb.append(cur + " ");
        }
        for (int i = 1; i <= n; i++) {
            //간선 순회, 방문 여부 확인
            if (values[cur - 1][i]&&!visited[i - 1]) {
                dfs(i);
            }
        }
    }
    static void bfs(int cur) {
        Queue<Integer> wait = new LinkedList<>();
        if (!visited[cur - 1]) {
            visited[cur - 1] = true;
            sb.append(cur + " ");
            for (int i = 1; i <= n; i++) {
                //간선 순회, 방문 여부 확인
                if (values[cur - 1][i] && !visited[i - 1]) {
                    visited[i - 1] = true;
                    sb.append(i + " ");
                    wait.add(i);
                }
            }
        }
        while (!wait.isEmpty()) {
            int waitValue = wait.poll();
            for (int i = 1; i <= n; i++) {
                //간선 순회, 방문 여부 확인
                if (values[waitValue - 1][i] && !visited[i - 1]) {
                    visited[i - 1] = true;
                    sb.append(i + " ");
                    wait.add(i);
                }
            }
        }
    }

}
