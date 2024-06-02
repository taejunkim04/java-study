package studies;

import java.util.Scanner;

public class Main11047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int type = scanner.nextInt();
        int amount = scanner.nextInt();
        int coin = 0;
        int[] array = new int[type];
        for (int i = 0; i < type; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = type - 1; i >= 0; i--) {
            if (amount / array[i] >= 1) {
                coin += amount / array[i];
                amount %= array[i];
                if (amount == 0) {
                    System.out.println(coin);
                    break;
                }
            }
        }

    }
}
