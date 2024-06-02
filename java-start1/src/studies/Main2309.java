package studies;

import java.util.Arrays;
import java.util.Scanner;
public class Main2309 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[9];
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            array[i] = scanner.nextInt();
            sum += array[i];
        }

        boolean breakKay = false;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (sum - array[i] - array[j] == 100 && i != j) {
                    array[i] = 0;
                    array[j] = 0;
                    breakKay = true;
                    break;
                }
            }
            if (breakKay) {
                break;
            }
        }
        Arrays.sort(array);
        for (int i : array) {
            if (i != 0) {
                System.out.println(i);
            }
        }
    }
}
/*합은 모두 순회하여 계산
* 결국 오름차순으로 정렬하여 출력해야 되기 때문에 배열로 만들어 계산*/
