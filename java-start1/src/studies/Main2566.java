package studies;

import java.util.Scanner;

public class Main2566 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr1 = new int[9][9];
        int n = 1, m = 1;
        int max = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr1[i][j] = scanner.nextInt();
                if (arr1[i][j] > max) {
                    max = arr1[i][j];
                    n = i+1;
                    m = j+1;
                }
            }
        }
        System.out.println(max);
        System.out.println(n+" "+m);
    }
}
