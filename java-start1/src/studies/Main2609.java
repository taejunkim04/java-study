package studies;

import java.util.Scanner;
public class Main2609 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value1 = scanner.nextInt();
        int value2 = scanner.nextInt();
        int temp;
        if (value1 > value2) {
            for (int i = value2; i > 0; i--) {
                if (value1 % i == 0 && value2 % i == 0) {
                    System.out.println(i);
                    break;
                }
            }
            temp = value2;
            while (true) {
                if (temp % value1 == 0) {
                    System.out.println(temp);
                    break;
                }
                temp += value2;
            }
        } else {
            for (int i = value1; i > 0; i--) {
                if (value1 % i == 0 && value2 % i == 0) {
                    System.out.println(i);
                    break;
                }
            }
            temp = value1;
            while (true) {
                if (temp % value2 == 0) {
                    System.out.println(temp);
                    break;
                }
                temp += value1;
            }
        }
    }
}
