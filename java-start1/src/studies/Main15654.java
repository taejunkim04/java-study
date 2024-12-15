package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main15654 {
    static int[] bufferArr;
    static int[] values;
    static StringBuilder sb=new StringBuilder();
    static int len;
    static int numCou;
    static boolean[] check;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        numCou = Integer.parseInt(tk.nextToken());
        len = Integer.parseInt(tk.nextToken());
        tk = new StringTokenizer(reader.readLine());
        values = new int[numCou];
        bufferArr = new int[numCou];
        check = new boolean[numCou];
        for (int i = 0; i < numCou; i++) {
            values[i] = Integer.parseInt(tk.nextToken());
        }
        Arrays.sort(values);
        dfs(0);
        System.out.println(sb);
    }

    static void dfs(int depth) {
        if (depth == len) {
            for (int i = 0; i < len; i++){
                sb.append(bufferArr[i] + " ");
            }
            sb.append("\n");
            return;
        }
        for (int i = 0; i < numCou; i++) {
            if (!check[i]) {
                check[i] = true;
                bufferArr[depth] = values[i];
                dfs(depth + 1);
                check[i] = false;
            }
        }
    }
}
