package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main1966 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int caseNum = Integer.parseInt(reader.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < caseNum; i++) {
            StringTokenizer tk = new StringTokenizer(reader.readLine());
            int valueCount = Integer.parseInt(tk.nextToken());
            int point = Integer.parseInt(tk.nextToken());
            Queue<Integer> queue = new LinkedList<>();
            Queue<Integer> indexQueue = new LinkedList<>();

            tk = new StringTokenizer(reader.readLine());
            for (int j = 0; j < valueCount; j++) {
                queue.offer(Integer.parseInt(tk.nextToken()));
                indexQueue.offer(j);
            }

            int count = 1;
            while (!queue.isEmpty()) {
                int max = Collections.max(queue);
                int cur = queue.poll();
                int curIndex = indexQueue.poll();

                if(cur == max) {
                    if(curIndex == point) {
                        sb.append(count).append("\n");
                        break;
                    }
                    count++;
                } else {
                    queue.offer(cur);
                    indexQueue.offer(curIndex);
                }
            }
        }
        System.out.println(sb);
    }
}
