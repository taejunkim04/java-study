package studies;

import java.util.Scanner;

public class Main1934 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int temp1 = scanner.nextInt();
            int temp2 = scanner.nextInt();
            if (temp2 % temp1 == 0) {
                System.out.println(temp2);
            } else {
                System.out.println(math(temp1,temp2));
            }
        }
    }

    static int math(int a, int b) {
        int key = 0;
        int i = 2;
        while (true) {
            int array = b*i;
            if (array % a == 0) {
                key = array;
            }
            if (key != 0) {
                return key;
            }
            i += 1;
        }
    }
}
