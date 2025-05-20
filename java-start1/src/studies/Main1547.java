package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main1547 {
    //공
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        StringTokenizer tk;
        int[] values = new int[]{1, 2, 3};
        for (int i = 0; i < count; i++) {
            Set<Integer> nums = new HashSet<>();
            tk = new StringTokenizer(reader.readLine());
            int fir = Integer.parseInt(tk.nextToken());
            int sec = Integer.parseInt(tk.nextToken());
            nums.add(fir);
            nums.add(sec);
            if (!nums.contains(values[0])) {
                int temp = values[2];
                values[2] = values[1];
                values[1] = temp;
            } else if (!nums.contains(values[1])) {
                int temp = values[2];
                values[2] = values[0];
                values[0] = temp;
            } else {
                int temp = values[0];
                values[0] = values[1];
                values[1] = temp;
            }
            ;
        }
        System.out.println(values[0]);

    }
}
