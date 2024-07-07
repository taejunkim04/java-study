package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2822 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] point = new int[8];
        int[] resultArr = new int[5];
        boolean[] values = new boolean[151];
        StringBuilder builder = new StringBuilder();
        int sum = 0;
        int count = 0;
        for (int i = 0; i < 8; i++) {
            int temp = Integer.parseInt(reader.readLine());
            values[temp] = true;
            point[i] = temp;
        }
        for (int i = 150; i >= 0; i--) {
            if (values[i]) {
                sum += i;
                resultArr[count] = i;
                count++;
                if (count == 5) {
                    break;
                }
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int i1 : resultArr) {
                if (point[i] == i1) {
                    builder.append(i + 1).append(" ");
                }
            }
        }
        System.out.println(sum);
        System.out.println(builder);
    }
}
