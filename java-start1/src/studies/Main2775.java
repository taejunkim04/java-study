package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2775 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int caseCou = Integer.parseInt(reader.readLine());
        int[][] setNum = new int[15][15];

        for (int i = 0; i < 15; i++) {
            setNum[0][i] = i;
            setNum[i][1] = 1;
        }
        for(int i = 1; i < 15; i ++) {	// 1층부터 14층까지
            for(int j = 2; j < 15; j++) {	// 2호부터 14호까지
                setNum[i][j] = setNum[i][j - 1] + setNum[i - 1][j];
            }
        }
        for (int i = 0; i < caseCou; i++) {
            int flo = Integer.parseInt(reader.readLine());
            int ho = Integer.parseInt(reader.readLine());
            sb.append(setNum[flo][ho]).append("\n");
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }
}
