package studies;

import java.util.Scanner;

//브루트포스 알고리즘
public class Main1436 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int num = 666;
        int count = 1;

        while(count != N) {
            num++;
            if(String.valueOf(num).contains("666")) {
                count++;
            }
        }
        System.out.println(num);
    }
}
