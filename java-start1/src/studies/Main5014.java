package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main5014 {
    //스타트링크
    static int buHigh,officeHigh,curHi,upHi, downHi, count;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        buHigh = Integer.parseInt(tk.nextToken());
        curHi = Integer.parseInt(tk.nextToken());
        officeHigh = Integer.parseInt(tk.nextToken());
        upHi = Integer.parseInt(tk.nextToken());
        downHi = Integer.parseInt(tk.nextToken());
        visited = new boolean[buHigh + 1];

        count = -1;
        bfs();
        if (count == -1) {
            System.out.println("use the stairs");
        } else {
            System.out.println(count);
        }
    }

    static void bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(curHi);
        int runCou = 0;
        while (!queue.isEmpty()) {
            int temp = queue.size();
            for (int i = 0; i < temp; i++) {
                int curNum = queue.remove();
                if (curNum == officeHigh) {
                    count = runCou;
                    return;
                }
                int[] nextValues = new int[2];
                nextValues[0] = curNum + upHi;
                nextValues[1] = curNum - downHi;
                for (int nextValue : nextValues) {
                    if (nextValue >= 1 && nextValue <= buHigh) {
                        if (!visited[nextValue]) {
                            visited[nextValue] = true;
                            queue.add(nextValue);
                        }
                    }
                }
            }
            runCou++;
        }
    }
}
