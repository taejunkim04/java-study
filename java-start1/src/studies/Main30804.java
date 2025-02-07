package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main30804 {
    //다른 숫자가 나오기 전 가장 긴 구간
    static int[] tang;
    static int fruCou;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        fruCou = Integer.parseInt(reader.readLine());
        tang = new int[fruCou];
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        for (int i = 0; i < fruCou; i++) {
            tang[i] = Integer.parseInt(tk.nextToken());
        }
        System.out.println(findLongestSegment());
    }

    static int findLongestSegment() {
        if (fruCou == 1) return 1; // 원소가 하나일 경우

        int left = 0, right = 0;
        int maxLen = 0;
        Map<Integer, Integer> countMap = new HashMap<>();

        while (right < fruCou) {
            countMap.put(tang[right], countMap.getOrDefault(tang[right], 0) + 1);

            while (countMap.size() > 2) { // 2개 초과하는 숫자가 나오면 왼쪽 포인터 이동
                countMap.put(tang[left], countMap.get(tang[left]) - 1);
                if (countMap.get(tang[left]) == 0) {
                    countMap.remove(tang[left]);
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        return maxLen;
    }
}
