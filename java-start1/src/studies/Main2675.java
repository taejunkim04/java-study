package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        StringBuilder[] sb = new StringBuilder[201];

        for (int i = 0; i < 201; i++) {
            sb[i] = new StringBuilder();
        }
        for (int i = 0; i < count; i++) {
            StringTokenizer tk = new StringTokenizer(reader.readLine());
            int temp = Integer.parseInt(tk.nextToken());
            sb[temp].append(temp).append(" ").append(tk.nextToken()).append("\n");
        }
        for (int i = 0; i < 201; i++) {
            if (sb[i].length() > 0) {
                System.out.print(sb[i]);
            }
        }
    }
}
