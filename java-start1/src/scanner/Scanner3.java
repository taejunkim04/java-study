package scanner;

import java.util.Scanner;

public class Scanner3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 값을 입력하시오: ");
        int val1= scanner.nextInt();

        System.out.print("두번째 값을 입력하시오: ");
        int val2 = scanner.nextInt();
        if (val1>val2){
            System.out.println(val1);
        } else if (val1==val2) {
            System.out.println("같은 값입니다.");
        }else {
            System.out.println(val2);
        }
    }
}
