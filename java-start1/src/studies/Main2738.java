package studies;

import java.util.Scanner;

public class Main2738 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr1[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr2[i][j] = scanner.nextInt();
                arr1[i][j] += arr2[i][j];
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
