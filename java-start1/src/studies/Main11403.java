package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main11403 {
    //경로찾기
    static int[][] check;
    static int size;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(reader.readLine());
        check = new int[size][size];
        StringTokenizer tk;
        for (int i = 0; i < size; i++) {
            tk = new StringTokenizer(reader.readLine());
            for (int j = 0; j < size; j++) {
                check[i][j] = Integer.parseInt(tk.nextToken());
            }
        }
        for (int i = 0; i < size; i++) {
            if (!run()) {
                 break;
            }
        }
        for (int[] ints : check) {
            for (int anInt : ints) {
                sb.append(anInt + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
    static boolean run() {
        boolean change = false;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (check[i][j] == 1) {
                    for (int k = 0; k < size; k++) {
                        if (check[j][k] == 1) {
                            check[i][k] = 1;
                            change = true;
                        }
                    }
                }
            }
        }
        return change;
    }
}
