package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2644 {
    //촌수계산
    static int perCou,startNum, endNum, nodeCou, count;
    static boolean[][] map;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        perCou = Integer.parseInt(reader.readLine());
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        startNum = Integer.parseInt(tk.nextToken());
        endNum = Integer.parseInt(tk.nextToken());
        nodeCou = Integer.parseInt(reader.readLine());
        map = new boolean[perCou + 1][perCou + 1];
        visited = new boolean[perCou + 1];
        for (int i = 0; i < nodeCou; i++) {
            tk = new StringTokenizer(reader.readLine());
            int fir = Integer.parseInt(tk.nextToken());
            int sec = Integer.parseInt(tk.nextToken());
            map[fir][sec] = true;
            map[sec][fir] = true;
        }
        count = 1000000;
        for (int i = 1; i <= perCou; i++) {
            if (map[startNum][i]) {
                visited[i] = true;
                dfs(1, i);
                visited[i] = false;
            }
        }

        if (count == 1000000) {
            System.out.println(-1);
        } else {
            System.out.println(count);
        }
    }

    static void dfs(int runCou, int curNum) {
        if (runCou >= count) {
            return;
        }
        if (curNum == endNum) {
            count = runCou;
            return;
        }
        for (int i = 1; i <= perCou; i++) {
            if (map[curNum][i] && !visited[i]) {
                visited[i] = true;
                dfs(runCou + 1, i);
                visited[i] = false;
            }
        }
    }
}
