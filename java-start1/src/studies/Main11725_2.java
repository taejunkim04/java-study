package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main11725_2 {
    //트리의 부모 찾기(다시 풀기)
    static int[] superNode;
    static ArrayList<Integer>[] list;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        list = new ArrayList[count + 1];
        for (int i = 1; i <= count; i++) {
            list[i] = new ArrayList<>();
        }
        superNode = new int[count + 1];
        visited = new boolean[count + 1];
        StringTokenizer tk;
        for (int i = 1; i < count; i++) {
            tk = new StringTokenizer(reader.readLine());
            int node1 = Integer.parseInt(tk.nextToken());
            int node2 = Integer.parseInt(tk.nextToken());
            list[node1].add(node2);
            list[node2].add(node1);
        }
        check(1);
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= count; i++) {
            sb.append(superNode[i]).append("\n");
        }
        System.out.println(sb);
    }

    static void check(int par) {
        for (int i : list[par]) {
            if (!visited[i]) {
                superNode[i] = par;
                visited[i] = true;
                check(i);
            }
        }
    }
}
