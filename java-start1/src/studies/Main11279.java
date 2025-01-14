package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main11279 {
    //최대 힙
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        Queue<Integer> values = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            int temp = Integer.parseInt(reader.readLine());
            if (temp == 0) {
                if (values.isEmpty()) {
                    sb.append(0).append("\n");
                } else {
                    sb.append(values.remove()).append("\n");
                }
            } else {
                values.add(temp);
            }
        }
        System.out.println(sb);
    }
}
