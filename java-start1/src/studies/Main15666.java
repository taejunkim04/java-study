package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.SortedSet;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main15666 {
    //n과m 12
    static int n, m;
    static StringBuilder sb = new StringBuilder();
    static SortedSet<Integer> values = new TreeSet<>();
    static int[] outArr;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        n = Integer.parseInt(tk.nextToken());
        m = Integer.parseInt(tk.nextToken());
        tk = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++) {
            values.add(Integer.parseInt(tk.nextToken()));
        }
        outArr = new int[m];
        run(0, 0);
        System.out.println(sb);
    }

    static void run(int depth,int lastValue) {
        if (depth == m) {
            for (int i : outArr) {
                sb.append(i + " ");
            }
            sb.append("\n");
            return;
        }
        for (Integer value : values) {
            if (value >= lastValue) {
                outArr[depth] = value;
                run(depth + 1, value);
            }
        }
    }
}
