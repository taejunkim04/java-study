package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1654_2 {
    //랜선자르기(다시 풀기)
    static int[] lengths;
    static int count, needLen;
    static long min, max;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        count = Integer.parseInt(tk.nextToken());
        needLen = Integer.parseInt(tk.nextToken());
        lengths = new int[count];
        min = 0;
        max = 0;
        for (int i = 0; i < count; i++) {
            lengths[i] = Integer.parseInt(reader.readLine());
            if (max < lengths[i]) {
                max = lengths[i];
            }
        }
        max++;
        run();
        System.out.println(min - 1);
    }
    static void run() {
        while (min < max) {
            long mid = (min + max) / 2;
            long temp = 0;
            for (int length : lengths) {
                temp += length / mid;
            }
            if (temp < needLen) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }
    }
}
