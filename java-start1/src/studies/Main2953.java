package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2953 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int point = 0;
        int highScore = 0;
        for (int i = 1; i <= 5; i++) {
            StringTokenizer tk = new StringTokenizer(reader.readLine());
            int temp = 0;
            for (int j = 0; j < 4; j++) {
                temp += Integer.parseInt(tk.nextToken());
            }
            if (temp > highScore) {
                point = i;
                highScore = temp;
            }
        }
        System.out.println(point + " " + highScore);
    }
}
