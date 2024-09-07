package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean[] alphas;

        int count = Integer.parseInt(reader.readLine());
        int result = 0;
        for (int i = 0; i < count; i++) {
            String s = reader.readLine();
            alphas = new boolean[26];
            boolean check = true;
            int last = s.charAt(0) - 97;
            alphas[last] = true;
            for (int j = 1; j < s.length(); j++) {
                int temp = s.charAt(j) - 97;
                if (last != temp) {
                    if (!alphas[temp]) {
                        alphas[temp] = true;
                        last = temp;
                    } else {
                        check = false;
                        break;
                    }
                }
            }
            if (check) {
                result++;
            }
        }

        System.out.println(result);
    }
}
