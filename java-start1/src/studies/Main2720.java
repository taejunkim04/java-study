package studies;

import java.util.Scanner;

public class Main2720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            int temp = scanner.nextInt();
            System.out.print(temp / 25 + " ");
            temp %= 25;
            System.out.print(temp / 10 + " ");
            temp %= 10;
            System.out.print(temp / 5 + " ");
            temp %= 5;
            System.out.println(temp);
        }
    }
}
