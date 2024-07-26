package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1094 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int value = Integer.parseInt(reader.readLine());
        int temp = 0;//자표 위치 지정으로 사용
        int[] values = new int[7];
        for (int mainValue = 64; mainValue > 0; mainValue /= 2) {
            values[temp] = mainValue;
            temp++;
        }
        temp = 0;//sum 대신 사용
        int count = 0;
        for (int value1 : values) {
            if (temp + value1 <= value) {
                temp += value1;
                count++;
                if (temp == value) {
                    System.out.println(count);
                    break;
                }
            }
        }
    }
}
