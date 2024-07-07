package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main15655 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(tk.nextToken());
        int m = Integer.parseInt(tk.nextToken());
        tk = new StringTokenizer(reader.readLine());
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = Integer.parseInt(tk.nextToken());
        }//값 입력
        Arrays.sort(values);
        //오름차 순 정렬로 연산 용이화
        // m이 1일 때와 n과 같을 때는 뱔도로 처리 그 외는 로직으로 처리
        if (m == 1) {
            for (int value : values) {
                sb.append(value).append("\n");
            }
        } else if (n == m) {
            for (int value : values) {
                sb.append(value).append(" ");
            }
        } else {

        }
        System.out.println(sb);
    }
}
