package scanner;

import java.util.Scanner;

public class ScannerWhile3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("숫자를 입력하시오: ");
            int num = scanner.nextInt();
            sum+=num;
            if (num == 0) {
                System.out.println("지금까지의 합은: " + sum);
                break;
            }
        }
    }
}
