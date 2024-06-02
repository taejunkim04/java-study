package studies;

import java.util.Scanner;

public class Main13241 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long temp1 = scanner.nextLong();
        long temp2 = scanner.nextLong();
        int i = 1;
        while (true) {
            if (temp2*i % temp1 == 0) {
                System.out.println(temp2 * i);
                break;
            }
            i++;
        }
    }
}
