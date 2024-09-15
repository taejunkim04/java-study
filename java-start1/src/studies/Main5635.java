package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main5635 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        String youngName = "", oldName = "";
        int[][] values = new int[2][3];
        values[0][2] = 1989;
        values[1][2] = 2011;
        for (int i = 0; i < count; i++) {
            StringTokenizer tk = new StringTokenizer(reader.readLine());
            String tempS = tk.nextToken();
            int day = Integer.parseInt(tk.nextToken());
            int month = Integer.parseInt(tk.nextToken());
            int year = Integer.parseInt(tk.nextToken());

            if (year > values[0][2]) {
                youngName = tempS;
                values[0][0] = day;
                values[0][1] = month;
                values[0][2] = year;
            } else if (year == values[0][2]) {
                if (month > values[0][1]) {
                    youngName = tempS;
                    values[0][0] = day;
                    values[0][1] = month;
                    values[0][2] = year;
                } else if (month == values[0][1]) {
                    if (day > values[0][0]) {
                        youngName = tempS;
                        values[0][0] = day;
                        values[0][1] = month;
                        values[0][2] = year;
                    }
                }
            }
            if (year < values[1][2]) {
                oldName = tempS;
                values[1][0] = day;
                values[1][1] = month;
                values[1][2] = year;
            } else if (year == values[1][2]) {
                if (month < values[1][1]) {
                    oldName = tempS;
                    values[1][0] = day;
                    values[1][1] = month;
                    values[1][2] = year;
                } else if (month == values[1][1]) {
                    if (day < values[1][0]) {
                        oldName = tempS;
                        values[1][0] = day;
                        values[1][1] = month;
                        values[1][2] = year;
                    }
                }
            }
        }
        System.out.println(youngName);
        System.out.println(oldName);
    }
}
