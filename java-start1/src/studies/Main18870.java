package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main18870 {
    //좌표 압축
    static int count;
    static int[] values, sortedValues;
    static Map<Integer, Integer> integerMap = new HashMap<>();
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        count = Integer.parseInt(reader.readLine());

        values = new int[count];
        sortedValues = new int[count];
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        for (int i = 0; i < count; i++) {
            values[i] = Integer.parseInt(tk.nextToken());
            sortedValues[i] = values[i];
        }
        Arrays.parallelSort(sortedValues);
        int last = 1000000001;
        int num = 0;
        for (int i = 0; i < count; i++) {
            if (last != sortedValues[i]) {
                last = sortedValues[i];
                integerMap.put(last, num);
                num++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(integerMap.get(values[i]) + " ");
        }
        System.out.println(sb);
    }
}
