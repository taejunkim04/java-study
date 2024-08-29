package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main4673 {
    public static boolean[] check = new boolean[10001];
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10000; i++) {
            int n = dr(i);

            if(n < 10001){	// 10000 이 넘는 수는 필요가 없음
                check[n] = true;
            }
        }
        for (int i = 1; i < 10001; i++) {
            if (!check[i]) {	// false 인 인덱스만 출력
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }
    public static int dr(int number){
        int sum = number;

        while(number != 0){
            sum = sum + (number % 10); // 첫 째 자리수
            number = number/10;	// 10을 나누어 첫 째 자리를 없앤다
        }

        return sum;
    }
}
