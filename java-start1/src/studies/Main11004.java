package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main11004 {
    //k번째 수
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(tk.nextToken());
        int k = Integer.parseInt(tk.nextToken());

        Queue<Integer> values = new PriorityQueue<>();

        tk = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++) {
            values.add(Integer.parseInt(tk.nextToken()));
        }
        for (int i = 0; i < k - 1; i++) {
            values.remove();
        }
        System.out.println(values.remove());
    }
}
