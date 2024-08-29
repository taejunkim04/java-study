package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        int count1 = 0;
        int count2 = 0;

        for (int i = 1; i <= 8; i++) {
            int temp = Integer.parseInt(tk.nextToken());
            if (temp == i) {
                count1++;
            } else if (temp == 9 - i) {
                count2++;
            }
        }
        if (count1 == 8) {
            System.out.println("ascending");
        } else if (count2 == 8) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }

}
