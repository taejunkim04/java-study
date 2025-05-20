package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main20125 {
    //쿠키의 신체 측정(왼,오팔,허리, 왼,오 다리)
    static int size,heartR, heartC,left,right,he,leftLeg, rightLeg;
    static boolean[][] map;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(reader.readLine());
        map = new boolean[size][size];
        for (int i = 0; i < size; i++) {
            String s = reader.readLine();
            for (int j = 0; j < size; j++) {
                map[i][j] = s.charAt(j) == '*';
            }
        }
        StringBuilder sb = new StringBuilder();
        serHer();
        sb.append(heartR + 1).append(" ").append(heartC + 1).append("\n");
        partSer();
        sb.append(left+" ").append(right+" ").append(he+" ").append(leftLeg+" ").append(rightLeg);
        System.out.println(sb);
    }

    static void serHer() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (map[i][j]) {
                    if (ar(i + 1, j) && ar(i - 1, j) && ar(i, j + 1) && ar(i, j - 1)) {
                        heartR = i;
                        heartC = j;
                        return;
                    }
                }
            }
        }
    }

    static boolean ar(int curX, int curY) {
        if (curX < 0 || curX >= size || curY < 0 || curY >= size) {
            return false;
        }
        return map[curX][curY];
    }

    static void partSer() {
        left = 0;
        for (int i = heartC - 1; i >= 0; i--) {
            if (map[heartR][i]) {
                left++;
            } else {
                break;
            }
        }
        right = 0;
        for (int i = heartC + 1; i < size; i++) {
            if (map[heartR][i]) {
                right++;
            } else {
                break;
            }
        }
        he = 0;
        for (int i = heartR + 1; i < size; i++) {
            if (map[i][heartC]) {
                he++;
            } else {
                break;
            }
        }
        leftLeg = 0;
        for (int i = heartR + he + 1; i < size; i++) {
            if (map[i][heartC - 1]) {
                leftLeg++;
            } else {
                break;
            }
        }
        rightLeg = 0;
        for (int i = heartR + he + 1; i < size; i++) {
            if (map[i][heartC + 1]) {
                rightLeg++;
            } else {
                break;
            }
        }
    }
}
