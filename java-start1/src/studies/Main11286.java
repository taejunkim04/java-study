package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main11286 {
    //절댓값 힙
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        Queue<Integer> values = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int abs1 = Math.abs(o1);
                int abs2 = Math.abs(o2);
                if (abs1 != abs2) {
                    return Integer.compare(abs1, abs2);
                } else {
                    return Integer.compare(o1, o2);
                }
            }
        });
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            int value = Integer.parseInt(reader.readLine());
            if (value == 0) {
                if (values.isEmpty()) {
                    sb.append(0).append("\n");
                } else {
                    sb.append(values.poll()).append("\n");
                }
            } else {
                values.add(value);
            }
        }
        System.out.println(sb);
    }
}
