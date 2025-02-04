package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main10431 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int caseCou = Integer.parseInt(reader.readLine());

        StringBuilder sb = new StringBuilder();
        StringTokenizer tk;
        for (int i = 0; i < caseCou; i++) {
            int move = 0;
            tk = new StringTokenizer(reader.readLine());
            sb.append(Integer.parseInt(tk.nextToken()) + " ");
            int[] humans = new int[20];
            for (int j = 0; j < 20; j++) {
                humans[j] = Integer.parseInt(tk.nextToken());
            }
            for (int j=0; j<20; j++) {
                for (int k=0; k<j; k++) {
                    if (humans[k] > humans[j]) move++;
                }
            }

            sb.append(move + "\n");
        }
        System.out.println(sb);
    }
}
