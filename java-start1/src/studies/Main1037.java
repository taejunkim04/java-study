package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main1037 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        int[] arr = new int[count];
        if (count == 1) {
            arr[0] = Integer.parseInt(reader.readLine());
            System.out.println(arr[0]*arr[0]);
        } else {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            for (int i = 0; i < count; i++) {
                arr[i] = Integer.parseInt(tokenizer.nextToken());
            }
            Arrays.sort(arr);
            System.out.println(arr[0] * arr[count - 1]);
        }
    }
}
