package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main15663_2 {
    static int[] values;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    static int[] outValues;
    static int n, m;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        n = Integer.parseInt(tk.nextToken());
        m = Integer.parseInt(tk.nextToken());

        values = new int[n];
        outValues = new int[m];
        visited = new boolean[n];

        tk = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++) {
            values[i] = Integer.parseInt(tk.nextToken());
        }
        Arrays.sort(values);
        dfs(0);
        System.out.println(sb);
    }

    static void dfs(int depth) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                sb.append(outValues[i]+" ");
            }
            sb.append("\n");
            return;
        }
        int lastNum = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i] && lastNum != values[i]) {
                lastNum = values[i];
                outValues[depth] = values[i];
                visited[i] = true;
                dfs(depth + 1);
                visited[i] = false;
            }
        }
    }
}
