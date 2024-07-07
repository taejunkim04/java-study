package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10989 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        int count = Integer.parseInt(reader.readLine());
        int[] arr = new int[10001];
        for (int i = 0; i < count; i++) {
            arr[Integer.parseInt(reader.readLine())]++;
        }
        for (int i = 1; i < 10001; i++) {
            if (arr[i] != 0) {
                for (int j = 0; j < arr[i]; j++) {
                    builder.append(i).append("\n");
                }
            }
        }
        System.out.println(builder);
    }
}
