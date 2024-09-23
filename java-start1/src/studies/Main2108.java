package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int counts = Integer.parseInt(reader.readLine());
        int mid = counts / 2 ;
        int[] values = new int[counts];
        double sum = 0;
        for (int i = 0; i < counts; i++) {
            int temp = Integer.parseInt(reader.readLine());
            values[i] = temp;
            sum += temp;
        }

        Arrays.sort(values);
        boolean flag = false;
        int mode_max = 0;
        int mode = 10000;

        for(int i = 0; i < counts; i++) {
            int jump = 0;	// 동일한 수가 나온만큼 i 값 jump 시킬 변수
            int count = 1;
            int i_value = values[i];

            for(int j = i + 1; j < counts; j++){
                if(i_value != values[j]) {
                    break;
                }
                count++;
                jump++;
            }

            if(count > mode_max) {
                mode_max = count;
                mode = i_value;
                flag = true;
            }
            else if(count == mode_max && flag == true) {
                mode = i_value;
                flag = false;
            }

            i += jump;
        }


        System.out.println(Math.round(sum / counts));
        System.out.println(values[mid]);
        System.out.println(mode);
        System.out.println(values[counts - 1] - values[0]);
    }
}
