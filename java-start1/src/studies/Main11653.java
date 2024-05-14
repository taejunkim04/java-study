package studies;

import java.util.Scanner;

public class Main11653 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        if (a == 1) {
            System.out.println();
        } else {
            pr(a);
        }
    }

    static void pr(long value) {
        int i = 2;
        while (i <= value) {
            if (value % i == 0) {
                System.out.println(i);
                value = value / i;
            } else {
                i++;
            }
        }
    }
}
