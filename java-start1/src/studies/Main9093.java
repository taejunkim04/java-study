package studies;

import java.util.Scanner;

public class Main9093 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < count; i++) {
            String string = scanner.nextLine();
            String[] words = string.split(" ");
            for (String word : words) {
                for (int j = word.length() - 1; j >= 0; j--) {
                    out.append(word.charAt(j));
                }
                out.append(" ");
            }
            out.append("\n");
        }
        System.out.println(out);
    }
}
