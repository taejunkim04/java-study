package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main5596 {
    //시험점수
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] values = new int[2];
        StringTokenizer tk;
        for (int i = 0; i < 2; i++) {
            tk = new StringTokenizer(reader.readLine());
            for (int j = 0; j < 4; j++) {
                values[i] += Integer.parseInt(tk.nextToken());
            }
        }
        System.out.println(Math.max(values[0], values[1]));
    }
}
