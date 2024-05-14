package studies;

import java.util.Scanner;
import java.lang.Math.*;
public class Main1978 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < a; i++) {
            int value = scanner.nextInt();
            if (value == 2) {
                count++;
                continue;
            } else if (value==1) {
                continue;
            }
            if (valueSqrt(value)) {
                count++;
            }
        }
        System.out.println(count);
    }

    static boolean valueSqrt(int value) {
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
}
