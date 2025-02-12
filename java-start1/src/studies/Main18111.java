package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main18111 {
    //마인크래프트
    static int n,m, b;
    static Map<Integer, Integer> integerMap = new HashMap<>();
    static SortedSet<Integer> set = new TreeSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        n = Integer.parseInt(tk.nextToken());
        m = Integer.parseInt(tk.nextToken());
        b = Integer.parseInt(tk.nextToken());
        for (int i = 0; i < n; i++) {
            tk = new StringTokenizer(reader.readLine());
            for (int j = 0; j < m; j++) {
                int temp = Integer.parseInt(tk.nextToken());
                if (set.contains(temp)) {
                    integerMap.replace(temp, integerMap.get(temp) + 1);
                } else {
                    integerMap.put(temp, 1);
                    set.add(temp);
                }
            }
        }
        int time = 0;
        while (set.size() != 1) {
            time += mineAndFill();
        }
        System.out.println(time + " " + set.first());
    }
    static int mineAndFill() {
        int fillTime, mineTime;
        if (integerMap.get(set.first()) > b) {
            fillTime = Integer.MAX_VALUE;
        } else {
            fillTime = integerMap.get(set.first());
        }
        mineTime = integerMap.get(set.last()) * 2;
        if (mineTime < fillTime) {
            int lastNum = set.last();
            b += integerMap.get(lastNum);
            if (integerMap.containsKey(lastNum - 1)) {
                integerMap.replace(lastNum - 1, integerMap.get(lastNum - 1) + integerMap.get(lastNum));
                integerMap.remove(lastNum);
                set.remove(lastNum);
            } else {
                integerMap.put(lastNum - 1, integerMap.get(lastNum));
                integerMap.remove(lastNum);
                set.add(lastNum - 1);
                set.remove(lastNum);
            }
            return mineTime;
        } else {
            int first = set.first();
            b -= integerMap.get(first);
            if (integerMap.containsKey(first + 1)) {
                integerMap.replace(first + 1, integerMap.get(first + 1) + integerMap.get(first));
                integerMap.remove(first);
                set.remove(first);
            } else {
                integerMap.put(first + 1, integerMap.get(first));
                integerMap.remove(first);
                set.add(first + 1);
                set.remove(first);
            }
            return fillTime;
        }
    }
}
