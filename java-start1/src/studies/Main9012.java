package studies;

import java.util.Scanner;

public class Main9012 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();
        int value = 0;
        for (int i = 0; i < count; i++) {
            String str = scanner.nextLine();
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '(') {
                    value++;
                } else if (str.charAt(j)==')'){
                    value--;
                }
                if (value < 0) {
                    break;
                }
            }
            if (value == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            value = 0;
        }
    }
}
