package studies;

import java.util.Scanner;

public class Main10872 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bodyValue = scanner.nextInt();
        int sum = 1;
        if (bodyValue == 0 || bodyValue==1) {
            System.out.println(1);
        } else {
            for (int i = 2; i <= bodyValue; i++) {
                sum *= i;
            }
            System.out.println(sum);
        }
    }
}
