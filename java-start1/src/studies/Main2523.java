package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2523 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= count; i++) {
            for (int j = 0; j < i; j++) {
                sb.append('*');
            }
            sb.append("\n");
        }
        for (int i = count - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                sb.append('*');
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
