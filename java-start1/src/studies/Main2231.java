package studies;

import java.util.Scanner;

public class Main2231 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int sum = 0;
        int result = 0;
        for (int i = 0; i < value; i++) {
            sum = i;
            int temp = i;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            if (sum == value) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
