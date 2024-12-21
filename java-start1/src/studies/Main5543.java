package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main5543 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] bug = new int[3];
        int[] drink = new int[2];

        for (int i = 0; i < 3; i++) {
            bug[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < 2; i++) {
            drink[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(bug);
        Arrays.sort(drink);

        System.out.println(bug[0] + drink[0] - 50);
    }
}
