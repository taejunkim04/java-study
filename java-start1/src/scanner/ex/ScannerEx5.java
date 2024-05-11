package scanner.ex;

import java.util.Scanner;

public class ScannerEx5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 숫자를 입력하시오: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하시오: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            int temp;
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.print("두 숫자 사이의 모든 정수: ");
        for (; num1 < num2; num1++) {
            System.out.print(num1+",");
        }
        System.out.print(num2);
    }
}
