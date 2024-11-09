package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1735 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        int a = Integer.parseInt(tk.nextToken());
        int b = Integer.parseInt(tk.nextToken());
        tk = new StringTokenizer(reader.readLine());
        int c = Integer.parseInt(tk.nextToken());
        int d = Integer.parseInt(tk.nextToken());
        int newA = a * d + b * c;
        int newB = b * d;
        int count = 2;
        while (count <= newA) {
            if (newA % count == 0 && newB % count == 0) {
                newA /= count;
                newB /= count;
                continue;
            }
            count++;
        }
        System.out.println(newA + " " + newB);
    }
}
