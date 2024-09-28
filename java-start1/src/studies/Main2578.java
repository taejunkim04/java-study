package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2578 {
    private static int[][] values = new int[5][5];

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            StringTokenizer tk = new StringTokenizer(reader.readLine());
            for (int j = 0; j < 5; j++) {
                values[i][j] = Integer.parseInt(tk.nextToken());
            }
        }
        int[] speak = new int[25];
        for (int i = 0; i < 5; i++) {
            StringTokenizer tk = new StringTokenizer(reader.readLine());
            for (int j = 0; j < 5; j++) {
                speak[i * 5 + j] = Integer.parseInt(tk.nextToken());
            }
        }
        for (int i = 0; i < 25; i++) {
            arr(speak[i]);
            if (i > 10) {
                if (check()) {
                    System.out.println(i+1);
                    return;
                }
            }
        }
    }

    private static void arr(int value) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (value == values[i][j]) {
                    values[i][j] = 0;
                    return;
                }
            }
        }
    }

    private static boolean check() {
        int sum = 0;
        //가로
        for (int i = 0; i < 5; i++) {
            int temp = 0;
            for (int j = 0; j < 5; j++) {
                if (values[i][j] == 0) {
                    temp++;
                }
            }
            if (temp == 5) {
                sum++;
            }
        }
        //세로
        for (int i = 0; i < 5; i++) {
            int temp = 0;
            for (int j = 0; j < 5; j++) {
                if (values[j][i] == 0) {
                    temp++;
                }
            }
            if (temp == 5) {
                sum++;
            }
        }
        //대각선
        int temp = 0;
        for (int i = 0; i < 5; i++) {
            if (values[i][i] == 0) {
                temp++;
            }
        }
        if (temp == 5) {
            sum++;
        }
        temp = 0;
        for (int i = 4; i >= 0; i--) {
            if (values[i][4-i] == 0) {
                temp++;
            }
        }
        if (temp == 5) {
            sum++;
        }
        if (sum >= 3) {
            return true;
        } else {
            return false;
        }
    }
}
