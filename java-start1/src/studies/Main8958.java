package studies;

import java.util.Scanner;
public class Main8958 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < a; i++) {
            int sum = 0;
            boolean last = false;
            int bonus = 0;
            String str = scanner.nextLine();
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'O' && last) {
                    sum += 1 + bonus;
                    bonus += 1;
                } else if (str.charAt(j) == 'O') {
                    sum += 1;
                    last = true;
                    bonus = 1;
                }
                if (str.charAt(j) == 'X') {
                    last = false;
                }
            }
            System.out.println(sum);
        }
    }
}
