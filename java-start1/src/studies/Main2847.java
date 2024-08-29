package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2847 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(reader.readLine());
        int[] values = new int[cases];

        for (int i = 0; i < cases; i++) {
            values[i] = Integer.parseInt(reader.readLine());
        }
        int count = 0;
        for (int i = cases - 2; i >= 0; i--) {
            if (values[i] >= values[i + 1]) {    //다음 레벨보다 클 때
                count += values[i] - (values[i + 1] - 1);    //감소한 횟수 구하기
                values[i] = values[i + 1] - 1;    //감소 진행
            }
        }
        System.out.println(count);
    }
}
