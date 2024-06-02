package studies;

import java.util.Scanner;

public class Main1427 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int jail = 1;
        int temp = a;
        while (true) {
            if (temp < 10) {
                break;
            }
            temp /= 10;
            jail++;
        }
        int[] arr = new int[jail];
        for (int i = 0; i < jail; i++) {
            arr[i] = a % 10;
            a /= 10;
        }
        for (int i = 0; i < jail; i++) {
            for (int j = i; j < jail; j++) {
                if (arr[i] < arr[j]) {
                    int temp1 = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp1;
                }
            }
            System.out.print(arr[i]);
        }
    }
}
