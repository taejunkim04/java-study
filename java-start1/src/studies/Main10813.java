package studies;

import java.util.Scanner;

public class Main10813 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = scanner.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = i + 1;
        }
        for (int i = 0; i < count; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int temp = arr[a-1];
            arr[a - 1] = arr[b - 1];
            arr[b - 1] = temp;
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
