package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2455 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int inSubway = 0;
        int big = 0;
        StringTokenizer tk;
        for (int i = 0; i < 4; i++) {
            tk = new StringTokenizer(reader.readLine());
            int down = Integer.parseInt(tk.nextToken());
            int up = Integer.parseInt(tk.nextToken());
            inSubway -= down;
            inSubway += up;
            if (inSubway > big) {
                big = inSubway;
            }
        }
        System.out.println(big);
    }
}
