package studies;

import java.util.Scanner;

public class Main10773 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int case1 = scanner.nextInt();
        int[] arr = new int[case1+1];
        int pointers = 0;
        for (int i = 0; i < case1; i++) {
            int temp = scanner.nextInt();
            if (temp == 0) {
                pointers--;
                arr[pointers] = 0;
            } else {
                arr[pointers] = temp;
                pointers++;
            }
        }
        case1 = 0;
        for (int i : arr) {
            case1 += i;
        }
        System.out.println(case1);
    }
}
