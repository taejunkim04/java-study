package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main1697 {
    //숨바꼭질
    static int su, lit, res;
    static boolean[] visited = new boolean[100001];
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        su = Integer.parseInt(tk.nextToken());
        lit = Integer.parseInt(tk.nextToken());
        res = 100000000;
        bfs();
        System.out.println(res);
    }

    static void bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(su);
        int depth = 0;

        while (res == 100000000) {
            for (Integer i : queue) {
                if (i == lit) {
                    res = depth;
                    return;
                }
                visited[i] = true;
            }
            int temp = queue.size();
            for (int i = 0; i < temp; i++) {
                int cur = queue.remove();

                if (cur < lit && cur * 2 <= 100000 && !visited[cur * 2]) {
                    queue.add(cur * 2);
                }
                if (cur > 0 && !visited[cur - 1]) {
                    queue.add(cur - 1);
                }
                if (cur < 100000 && !visited[cur + 1]) {
                    queue.add(cur + 1);
                }
            }
            depth++;
        }
    }
}
