package studies;

import java.util.Scanner;

public class Main2908 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String str = Integer.toString(rel(a, b));
        for (int i = 2; i >= 0; i--) {
            System.out.print(str.charAt(i)-'0');
        }
    }

    static int rel(int a,int b) {
        if (a % 10 > b % 10) {
            return a;
        } else if (a % 10 < b % 10) {
            return b;
        }
        if (a % 100 > b % 100) {
            return a;
        } else if (a % 100 < b % 100) {
            return b;
        }
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
