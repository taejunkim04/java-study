package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2805_3 {
    //나무 자르기(이분탐색)
    static int woodCou, needLen,max;
    static int[] values;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        woodCou = Integer.parseInt(tk.nextToken());
        needLen = Integer.parseInt(tk.nextToken());
        values = new int[woodCou];
        tk = new StringTokenizer(reader.readLine());
        max = 0;
        for (int i = 0; i < woodCou; i++) {
            values[i] = Integer.parseInt(tk.nextToken());
            if (max < values[i]) {
                max = values[i];
            }
        }
        div();

        System.out.println(max-1);
    }

    static void div() {
        int min = 0;
        while (min < max) {
            int mid = (min + max) / 2;
            long sum = 0;
            for (int value : values) {
                if (value > mid) {
                    sum += value - mid;
                }
            }
            if (sum < needLen) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }
    }
}
