package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1991 {
    //트리 순회
    static StringBuilder sb = new StringBuilder();
    static int[][] graph = new int[26][3];
    static int nodeCount;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        nodeCount = Integer.parseInt(reader.readLine());

        StringTokenizer tk;
        for (int i = 0; i < nodeCount; i++) {
            tk = new StringTokenizer(reader.readLine());
            int body = tk.nextToken().charAt(0) - 65;
            graph[body][0] = body + 65;
            graph[body][1] = tk.nextToken().charAt(0);
            graph[body][2] = tk.nextToken().charAt(0);
        }
        high(0);
        sb.append("\n");
        middle(0);
        sb.append("\n");
        bottom(0);
        System.out.println(sb);
    }
    static void high(int cur){
        sb.append((char) graph[cur][0]);
        if (graph[cur][1] >= 65) {
            high(graph[cur][1] - 65);
        }
        if (graph[cur][2] >= 65) {
            high(graph[cur][2] - 65);
        }
    }
    static void middle(int cur){
        if (graph[cur][1] >= 65) {
            middle(graph[cur][1] - 65);
        }
        sb.append((char) graph[cur][0]);
        if (graph[cur][2] >= 65) {
            middle(graph[cur][2] - 65);
        }
    }
    static void bottom(int cur){
        if (graph[cur][1] >= 65) {
            bottom(graph[cur][1] - 65);
        }
        if (graph[cur][2] >= 65) {
            bottom(graph[cur][2] - 65);
        }
        sb.append((char) graph[cur][0]);
    }
}
