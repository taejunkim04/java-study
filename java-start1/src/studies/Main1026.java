package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        int[] arrA = new int[count];
        int[] arrB = new int[count];

        StringTokenizer tk = new StringTokenizer(reader.readLine());
        for (int i = 0; i < count; i++) {
            arrA[i] = Integer.parseInt(tk.nextToken());
        }
        tk = new StringTokenizer(reader.readLine());
        for (int i = 0; i < count; i++) {
            arrB[i] = Integer.parseInt(tk.nextToken());
        }
        Arrays.sort(arrA);
        Arrays.sort(arrB);

        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += arrA[i] * arrB[count - 1 - i];
        }
        System.out.println(sum);
    }
}
