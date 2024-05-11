package scanner;

import java.util.Scanner;

public class ScannerEx2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("입력한 숫자 "+num+"는 짝수입니다.");
        }else {
            System.out.println("입력한 숫자 "+num+"는 홀수입니다.");
        }
    }
}
