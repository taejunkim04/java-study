package studies;

import java.util.Scanner;
import java.lang.Math;
public class Main2581 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[] valueArray = new int[n];
        int count = 0;
        for (int i = m; i <= n; i++) {
            if (valueSqrt(i)){
                valueArray[count] = i;
                count++;
            }
        }
        int sum = 0;
        for (int i : valueArray) {
            sum += i;
        }
        if (sum != 0) {
            System.out.println(sum);
            System.out.println(valueArray[0]);
        }else{
            System.out.println(-1);
        }
    }
    static boolean valueSqrt(int value) {
        if (value == 2) {
            return true;
        } else if (value==1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
}
