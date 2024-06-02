package studies;

import java.util.Scanner;
import java.lang.Integer;
import java.lang.Long;
public class Main10824 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value1 = scanner.nextInt();
        int value2 = scanner.nextInt();
        int value3 = scanner.nextInt();
        int value4 = scanner.nextInt();
        String str1 = Integer.toString(value1) + Integer.toString(value2);
        String str2 = Integer.toString(value3) + Integer.toString(value4);
        long value5 = Long.parseLong(str1);
        long value6 = Long.parseLong(str2);
        long result = value5 + value6;
        System.out.println(result);
    }
}
