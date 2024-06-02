package studies;

import java.util.Scanner;

public class Main1193 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        scanner.close();

        int count = 1; // 대각선 개수 (몇 번째 대각선인지)
        int total = 0; // 대각선에 있는 분수의 총 개수 누적값

        // X번째 분수가 위치한 대각선을 찾기
        while (true) {
            total += count;
            if (total >= X) {
                break;
            }
            count++;
        }

        // 대각선 시작에서 X번째 분수의 위치를 찾기
        int prevTotal = total - count;
        int offset = X - prevTotal - 1;

        int numerator, denominator;
        if (count % 2 == 0) {
            // 짝수 번째 대각선인 경우 분자가 증가, 분모가 감소
            numerator = 1 + offset;
            denominator = count - offset;
        } else {
            // 홀수 번째 대각선인 경우 분모가 증가, 분자가 감소
            numerator = count - offset;
            denominator = 1 + offset;
        }

        System.out.println(numerator + "/" + denominator);
    }
}

