package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main6588 {
    //소수 배열을 미리 구하여 연산 수행

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean[] isPrime = new boolean[1000001];
        //소수배열 구하기
        for (int i = 2; i < 1000001; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i <= Math.sqrt(1000000); i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < 1000001; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        while (true) {
            int num = Integer.parseInt(reader.readLine());
            if (num == 0) {
                break;
            }//0이 입력시 프로그램 종료
            boolean sign = false;//값을 찾은 것에 대한 boolean
            for (int i = 2; i <= num / 2; i++) {
                if (isPrime[i] && isPrime[num - i]) {
                    System.out.println(num + " = " + i + " + " + (num - i));
                    sign = true;
                    break;
                }
            }
            if (!sign) {
                System.out.println("Goldbach's conjecture is wrong.");
            }
        }
    }
}
