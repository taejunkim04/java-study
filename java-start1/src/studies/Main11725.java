package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main11725 {
    //트리의 부모 찾기
    static int[] superNodes;
    static boolean[] visited;
    static int nodeCou;
    static ArrayList<Integer>[] list;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        nodeCou = Integer.parseInt(reader.readLine());
        superNodes = new int[nodeCou + 1];
        list = new ArrayList[nodeCou + 1];
        for (int i = 1; i <= nodeCou; i++) {
            list[i] = new ArrayList<>();
        }
        visited = new boolean[nodeCou + 1];
        StringTokenizer tk;
        for (int i = 1; i < nodeCou; i++) {
            tk = new StringTokenizer(reader.readLine());
            int x = Integer.parseInt(tk.nextToken());
            int y = Integer.parseInt(tk.nextToken());
            list[x].add(y);
            list[y].add(x);
        }
        dfs(1);

        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= nodeCou; i++) {
            sb.append(superNodes[i]).append("\n");
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }

    static void dfs(int start) {
        visited[start] = true;
        for (int i : list[start]) {
            if (!visited[i]) {
                superNodes[i] = start;
                dfs(i);
            }
        }
    }
}
