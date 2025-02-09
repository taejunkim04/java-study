package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main11286_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int caseCou = Integer.parseInt(reader.readLine());

        Queue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int abs1 = Math.abs(o1);
                int abs2 = Math.abs(o2);
                if (abs1 == abs2) {
                    return o1 - o2;
                } else {
                    return abs1 - abs2;
                }
            }
        });
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < caseCou; i++) {
            int temp = Integer.parseInt(reader.readLine());

            if (temp == 0) {
                if (!queue.isEmpty()) {
                    sb.append(queue.poll()).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else {
                queue.add(temp);
            }
        }
        System.out.println(sb);
    }
}
