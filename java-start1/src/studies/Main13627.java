package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main13627 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        int humans = Integer.parseInt(tk.nextToken());
        int returnHumans = Integer.parseInt(tk.nextToken());
        boolean[] check = new boolean[humans + 1];
        tk = new StringTokenizer(reader.readLine());
        for (int i = 0; i < returnHumans; i++) {
            check[Integer.parseInt(tk.nextToken())] = true;
        }

        StringBuilder sb = new StringBuilder();
        boolean allReturn = true;
        for (int i = 1; i <= humans; i++) {
            if (!check[i]) {
                allReturn = false;
                sb.append(i + " ");
            }
        }
        if (allReturn) {
            System.out.printf("* ");
        } else {
            System.out.printf("%s", sb);
        }
    }
}
