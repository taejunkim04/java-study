package studies;

import java.util.Scanner;

public class Main11021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        for (int i = 0; i < a; i++) {
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            System.out.println("Case #"+ (i + 1)+ ": "+ (first + second));
        }
    }
}
