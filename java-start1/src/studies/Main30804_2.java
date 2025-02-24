package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main30804_2 {
    //과일 탕후루(다시 풀기)
    static int count;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        count = Integer.parseInt(reader.readLine());
        arr = new int[count];
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        for (int i = 0; i < count; i++) {
            arr[i] = Integer.parseInt(tk.nextToken());
        }
        System.out.println(longSeg());
    }

    static int longSeg() {
        if (count == 1) {
            return 1;
        }
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0, right = 0;
        int maxLen = 0;
        while (right < count) {
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);
            while (map.size() > 2) {
                map.put(arr[left], map.get(arr[left]) - 1);
                if (map.get(arr[left]) == 0) {
                    map.remove(arr[left]);
                }
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        return maxLen;
    }

}
