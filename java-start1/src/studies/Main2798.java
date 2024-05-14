package studies;

import java.util.Scanner;
//브루트포스 알고리즘
public class Main2798 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] array = new int[a];
        int result = 0;
        for (int i = 0; i < a; i++) {
            array[i]= scanner.nextInt();
        }
        for (int c = 0; c < a; c++) {
            for (int d = c + 1; d < a; d++) {
                for (int e = d + 1; e < a; e++) {
                    int temp = array[c] + array[d] + array[e];
                    if (temp <= b && result < temp) {
                        result = temp;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
