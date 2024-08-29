package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main17286 {
    private static int[][] val = new int[3][2];
    private static int x, y;
    private static double min = Double.MAX_VALUE;
    private static boolean[] check = new boolean[3];
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        x = Integer.parseInt(tk.nextToken());
        y = Integer.parseInt(tk.nextToken());
        for (int i = 0; i < 3; i++) {
            tk = new StringTokenizer(reader.readLine());
            val[i][0] = Integer.parseInt(tk.nextToken());
            val[i][1] = Integer.parseInt(tk.nextToken());
        }
        all(0, 0, x, y);

        System.out.println((int)min);
    }

    private static void all(int count, double sum, int funX, int funY) {
        if (count == 3) {
            if (sum < min) {
                min = sum;
            }
        } else {
            for (int i = 0; i < 3; i++) {
                if (!check[i]) {
                    check[i] = true;
                    double temp = getDistance(funX, funY, val[i][0], val[i][1]); // 수정: 유클리드 거리 계산
                    all(count + 1, sum + temp, val[i][0], val[i][1]);
                    check[i] = false;
                }
            }
        }
    }
    private static double getDistance(int x1, int y1, int x2, int y2) { // 수정: 유클리드 거리 계산 함수 추가
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
}
// 1 2 3, 1 3 2
// 2 1 3  2 3 1
// 3 1 2  3 2 1
