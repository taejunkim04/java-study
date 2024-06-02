package studies;

import java.util.Scanner;

public class Main9095 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int case1 = scanner.nextInt();
        for (int i = 0; i < case1; i++) {
            int temp = scanner.nextInt();
            System.out.println(out(temp));
        }
    }

    static int out(int a) {
        int count = 0;
        if (a == 1) {
            return 1;
        } else if (a == 2) {
            return 2;
        } else if (a == 3) {
            return 4;
        }
        return 0;
    }
}
