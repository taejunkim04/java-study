package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main17425 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(reader.readLine());
        boolean[] valueArr = new boolean[1000001];
        int bigValue = 0;
        Queue<Integer> outOrder= new LinkedList<>();
        for (int i=0;i<count;i++) {
            int temp = Integer.parseInt(reader.readLine());
            valueArr[temp] = true;
            outOrder.add(temp);
        }
        for (int i = 1000000; i >= 1; i--) {
            if (valueArr[i]) {
                bigValue = i;
                break;
            }
        }

        long result = 0;
        long[] gArray = new long[bigValue + 1];
        for (int i = 1; i <= bigValue; i++) {
            for (int j = i; j <= bigValue; j += i) {
                gArray[j] += i;
            }
        }//배수에 해당하는 값에 값을 넣어 약수들 더하여 배열화
        for (int i = 1; i < bigValue; i++) {
            gArray[i + 1] += gArray[i];
        }//중복 값으로 지정하면 바로 결과값이 출력될 수 있도록 처리
        for (int i = 0; i < count; i++) {
            sb.append(gArray[outOrder.remove()]).append("\n");
        }
        System.out.println(sb);
    }
}
