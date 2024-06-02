package studies;

import java.util.Scanner;

public class Main10870 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a == 0) {
            System.out.println(0);
        } else if (a == 1) {
            System.out.println(1);
        } else {
            int key1 = 0;
            int key2 = 1;
            for (int i = 1; i < a; i++) {
                int temp = key1 + key2;
                key1 = key2;
                key2 = temp;
            }
            System.out.println(key2);
        }
    }
}
