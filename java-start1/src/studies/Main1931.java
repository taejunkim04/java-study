package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main1931 {
    public static int[][] timetable;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sch = Integer.parseInt(reader.readLine());
        timetable = new int[sch][2];
        StringTokenizer tk;
        for (int i = 0; i < sch; i++) {
            tk = new StringTokenizer(reader.readLine());
            timetable[i][0] = Integer.parseInt(tk.nextToken());
            timetable[i][1] = Integer.parseInt(tk.nextToken());
        }

        Arrays.sort(timetable, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });
        int count = 0;
        int lastEndTime = 0;
        for (int i = 0; i < sch; i++) {
            if (lastEndTime <= timetable[i][0]) {
                lastEndTime = timetable[i][1];
                count++;
            }
        }
        System.out.println(count);
    }
}
