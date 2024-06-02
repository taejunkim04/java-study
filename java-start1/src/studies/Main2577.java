package studies;

import java.util.Scanner;

public class Main2577 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long sum = 1;
        for (int i = 0; i < 3; i++) {
            int temp = scanner.nextInt();
            sum *= temp;
        }
        String str = Long.toString(sum);
        for (int i = 0; i <= 9; i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if ((str.charAt(j) - '0') == i) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
