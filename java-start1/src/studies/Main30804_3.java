package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main30804_3 {
    //과일 탕후루
    static int length;
    static int maxLen = 0;
    static int[] values;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        length = Integer.parseInt(reader.readLine());
        values = new int[length];
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        for (int i = 0; i < length; i++) {
            values[i] = Integer.parseInt(tk.nextToken());
        }
        ser();
        System.out.println(maxLen);
    }

    static void ser() {
        Queue<Integer> queue = new LinkedList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            queue.add(values[i]);
            if (map.containsKey(values[i])) {
                map.replace(values[i], map.get(values[i]) + 1);
            } else {
                map.put(values[i], 1);
            }
            while (map.size() > 2) {
                if (maxLen < queue.size() - 1) {
                    maxLen = queue.size() - 1;
                }
                int temp = queue.remove();
                map.replace(temp, map.get(temp) - 1);
                if (map.get(temp) == 0) {
                    map.remove(temp);
                }
            }
        }
        if (queue.size() > maxLen) {
            maxLen = queue.size();
        }
    }
}
