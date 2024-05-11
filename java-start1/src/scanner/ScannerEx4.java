package scanner;

import java.util.Scanner;

public class ScannerEx4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("구구단의 단 수를 입력하시오:");
        int num = scanner.nextInt();
        for (int i = 1; i <= 9; i++) {
            System.out.println(num+" x "+i+" = "+num*i);
        }
    }
}
