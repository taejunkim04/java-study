package array.ex;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class ArrayEx6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int j = scanner.nextInt();
        int[] num = new int[j];
        System.out.println(j + "개의 정수를 입력하세요");
        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
        }
        int min=num[0];
        int max=num[0];
        for (int i : num) {
            if (min>i){
                min = i;
            }
            if (max<i){
                max = i;
            }
        }
        System.out.println("가장 작은 정수:"+min);
        System.out.println("가장 큰 정수:"+max);

    }
}
