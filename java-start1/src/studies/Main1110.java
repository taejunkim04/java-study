package studies;

import java.util.Scanner;

public class Main1110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int keyValue = scanner.nextInt();
        System.out.println(plus(keyValue));
    }

    static int plus(int a) {
        int count = 0;
        int temp = a;
        while (true) {
            temp = (temp % 10) * 10 + (temp / 10 + temp % 10)%10;
            count++;
            if (temp == a) {
                return count;
            }
        }
    }
}
