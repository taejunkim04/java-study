package studies;

import java.util.Scanner;

public class Main11399 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        int[] intArray=new int[a];
        for (int i = 0; i < a; i++) {
            intArray[i] = scanner.nextInt();
        }
        int sum = 0;
        int again = a;
        for (int i = 0; i < a; i++) {
            for (int j = i; j < a; j++) {
                if (intArray[i] > intArray[j]) {
                    int temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
            sum += intArray[i] * again;
            again--;
        }
        System.out.println(sum);
    }
}
