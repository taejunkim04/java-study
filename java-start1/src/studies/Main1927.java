package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main1927 {
    //최소 힙
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        SortedMap<Integer, Integer> map = new TreeMap<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            int cho = Integer.parseInt(reader.readLine());
            if (cho == 0) {
                if (map.isEmpty()) {
                    sb.append(0).append("\n");
                } else {
                    int first = map.firstKey();
                    sb.append(first).append("\n");
                    if (map.get(first) > 1) {
                        int temp = map.get(first) - 1;
                        map.replace(first, temp);
                    } else {
                        map.remove(first);
                    }
                }
            } else {
                if (map.containsKey(cho)) {
                    int temp = map.get(cho) + 1;
                    map.replace(cho, temp);
                } else {
                    map.put(cho, 1);
                }
            }
        }
        System.out.println(sb);
    }
}
