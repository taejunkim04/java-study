package scanner;

import java.util.Scanner;

public class Scanner2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("값을 입력하시오: ");
        int val1 = scanner.nextInt();
        System.out.print("값을 입력하시오: ");
        int val2 = scanner.nextInt();

        int result = val1 + val2;
        System.out.println("더한 값은 " + result + " 입니다.");
    }
}
