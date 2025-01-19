package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main15663 {
    //n과 m (9)
    static int n, m;
    static int[] values,outValues;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
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
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }

    static void dfs(int count) {
        if (count == m) {
            for (int i = 0; i < m; i++) {
                sb.append(outValues[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        int lastUsed = -1; // 이전에 사용한 값을 저장
        for (int i = 0; i < n; i++) {
            if (!visited[i] && values[i] != lastUsed) { // 중복 방지
                visited[i] = true;
                outValues[count] = values[i];
                lastUsed = values[i];
                dfs(count + 1);
                visited[i] = false;
            }
        }
    }
}
