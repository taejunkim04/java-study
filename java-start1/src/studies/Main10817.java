package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main10817 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int firstNum = Integer.parseInt(tokenizer.nextToken());
        int secondNum = Integer.parseInt(tokenizer.nextToken());
        int thirdNum = Integer.parseInt(tokenizer.nextToken());
        int[] arr = {firstNum, secondNum, thirdNum};
        for (int i = 0; i < 3; i++) {
            int temp;
            for (int j = i+1; j < 3; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(arr[1]);
    }
}
