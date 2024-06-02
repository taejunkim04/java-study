package studies;

import java.util.Scanner;

public class Main11655 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        String str = scanner.nextLine();
        String[] arr = str.split(" ");
        for (String string : arr) {
            for (int i = 0; i < string.length(); i++) {
                char a = string.charAt(i);
                if (!Character.isLetter(a)) {
                    stringBuilder.append(a);
                    continue;
                }
                int n = (int) a + 13;
                if (Character.isUpperCase(a) && n > 90) {
                    n -= 26;
                }
                if (Character.isLowerCase(a) && n > 122) {
                    n -= 26;
                }
                stringBuilder.append((char) n);
            }
            stringBuilder.append(" ");
        }
        System.out.print(stringBuilder);
    }
}
