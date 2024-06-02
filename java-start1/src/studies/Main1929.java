package studies;

import java.util.Scanner;
public class Main1929 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value1 = scanner.nextInt();
        int value2 = scanner.nextInt();
        scanner.close();

        // 에라토스테네스의 체 알고리즘 적용
        boolean[] isPrime = new boolean[value2 + 1];
        for (int i = 2; i <= value2; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= value2; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= value2; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = Math.max(value1, 2); i <= value2; i++) {
            if (isPrime[i]) {
                System.out.println(i);
            }
        }
    }
}
