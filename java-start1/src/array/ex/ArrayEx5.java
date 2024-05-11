package array.ex;

import java.util.Scanner;

public class ArrayEx5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int j = scanner.nextInt();

        int[] num = new int[j];
        int total = 0;

        System.out.println(j + "개의 정수를 입력하세요");
        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
            total += num[i];
        }
        double avg=(double)total/ num.length;
        System.out.println("입력한 정수의 합계: " + total);
        System.out.println("입력한 정수의 평균: " + avg);
    }
}
