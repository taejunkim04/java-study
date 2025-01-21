package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2805_2 {
    //나무 자르기(이분탐색)
    static int treeCou, needLength, min, max;
    static int[] treeHeights;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        treeCou = Integer.parseInt(tk.nextToken());
        needLength = Integer.parseInt(tk.nextToken());
        treeHeights = new int[treeCou];
        min = 0;
        max = 0;
        tk = new StringTokenizer(reader.readLine());
        for (int i = 0; i < treeCou; i++) {
            treeHeights[i] = Integer.parseInt(tk.nextToken());
            if (max < treeHeights[i]) {
                max = treeHeights[i];
            }
        }

        run();
        System.out.println(min - 1);
    }

    static void run() {
        while(min < max) {
            int mid = (min + max) / 2;
            long sum = 0;
            for(int treeHeight : treeHeights) {
                if(treeHeight - mid > 0) {
                    sum += (treeHeight - mid);
                }
            }

            if(sum < needLength) {
                max = mid;
            }

            else {
                min = mid + 1;
            }
        }
    }
}
