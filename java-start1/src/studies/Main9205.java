package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main9205 {
    //맥주 마시면서 걸어가기
    //한 박스에 맥주 20개, 한 병을 마셔야 50미터 전진
    //빈 병을 포함해 20병을 넘을 수 없고, 구매 후 다시 마셔야함
    static int testCaseCou,conventionCou,sr,sc, er, ec;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        testCaseCou = Integer.parseInt(reader.readLine());
        StringTokenizer tk;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < testCaseCou; i++) {
            conventionCou = Integer.parseInt(reader.readLine());
            List<int[]> list = new ArrayList<>();
            tk = new StringTokenizer(reader.readLine());
            sr = Integer.parseInt(tk.nextToken());
            sc = Integer.parseInt(tk.nextToken());
            for (int j = 0; j < conventionCou; j++) {
                tk = new StringTokenizer(reader.readLine());
                int rec = Integer.parseInt(tk.nextToken());
                int col = Integer.parseInt(tk.nextToken());
                list.add(new int[]{rec, col});
            }
            tk = new StringTokenizer(reader.readLine());
            er = Integer.parseInt(tk.nextToken());
            ec = Integer.parseInt(tk.nextToken());
            if (bfs(list)) {
                sb.append("happy").append("\n");
            } else {
                sb.append("sad").append("\n");
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }

    static boolean bfs(List<int[]> list) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[] visited = new boolean[conventionCou];
        queue.add(new int[]{sr, sc});
        while (!queue.isEmpty()) {
            int[] point = queue.remove();
            if (Math.abs(point[0] - er) + Math.abs(point[1] - ec) <= 1000) {
                return true;
            }
            for (int i = 0; i < conventionCou; i++) {
                if (!visited[i]) {
                    int nr = list.get(i)[0], nc = list.get(i)[1];
                    if (Math.abs(point[0] - nr) + Math.abs(point[1] - nc) <= 1000) {
                        visited[i] = true;
                        queue.add(new int[]{nr, nc});
                    }
                }
            }
        }
        return false;
    }
}
