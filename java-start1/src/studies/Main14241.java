package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main14241 {
    //가장 큰 값 두 개를 이용하여 합을 구하고, 합과 가장 큰 값을 계속 연산하여 계산

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        int score = 0;
        int[] values = new int[count];
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        for (int i = 0; i < count; i++) {
            values[i] = Integer.parseInt(tk.nextToken());
        }// 값 입력
        Arrays.sort(values);
        for (int i = count - 1; i > 0; i--) {
            score += values[i] * values[i - 1];
            values[i - 1] = values[i] + values[i - 1];
        }
        System.out.println(score);
    }
}
