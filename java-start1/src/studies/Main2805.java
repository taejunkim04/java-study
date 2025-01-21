package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2805 {
    //나무 자르기(시간초관)(잘못된 알고리즘)
    static int treeCou, needLength;
    static long cutSize;
    static int[] treeHeights;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        treeCou = Integer.parseInt(tk.nextToken());
        needLength = Integer.parseInt(tk.nextToken());
        treeHeights = new int[treeCou];
        tk = new StringTokenizer(reader.readLine());
        for (int i = 0; i < treeCou; i++) {
            treeHeights[i] = Integer.parseInt(tk.nextToken());
        }

        cutSize = treeHeights[treeCou / 2];
        run();
        System.out.println(cutSize);
    }

    static void run() {
        while (true) {
            long temp = check(cutSize);
            if (temp >= needLength && check(cutSize + 1) < needLength) {
                break;
            }
            if (temp < needLength) {
                cutSize = cutSize / 2 + 1;
            } else {
                cutSize = cutSize * 3 / 2;
            }
        }
    }
    static long check(long cut) {
        long sum = 0;
        for (int i = treeCou - 1; i >= 0; i--) {
            if (treeHeights[i] > cutSize) {
                if (treeHeights[i] - cut > 0) {
                    sum += treeHeights[i] - cut;
                }
            }
        }
        return sum;
    }
}
