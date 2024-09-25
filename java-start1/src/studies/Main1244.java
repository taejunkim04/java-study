package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1244 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        boolean[] values = new boolean[count+1];
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        for (int i = 1; i <= count; i++) {
            boolean temp = (Integer.parseInt(tk.nextToken()) == 1) ? true : false;
            values[i] = temp;
        }
        int people = Integer.parseInt(reader.readLine());
        for (int i = 0; i < people; i++) {
            tk = new StringTokenizer(reader.readLine());
            int sex = Integer.parseInt(tk.nextToken());
            int lightNum = Integer.parseInt(tk.nextToken());
            if (sex == 1) {
                for (int j = lightNum; j <= count; j += lightNum) {
                    values[j] = !values[j];
                }
            } else {
                int start = lightNum;
                int end = lightNum;
                while (start > 1 && end < count && values[start - 1] == values[end + 1]) {
                    start--;
                    end++;
                }
                for (int j = start; j <= end; j++) {
                    values[j] = !values[j];
                }
            }
        }

        //20개씩 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= count; i++) {
            if (values[i]) {
                sb.append(1 + " ");
            } else {
                sb.append(0 + " ");
            }
            if (i % 20 == 0) {
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}
