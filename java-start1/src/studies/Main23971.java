package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main23971 {
    //ZOAC 4

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        int rec = Integer.parseInt(tk.nextToken());
        int col = Integer.parseInt(tk.nextToken());
        int sOff = Integer.parseInt(tk.nextToken());
        int gOff = Integer.parseInt(tk.nextToken());
        int temp1 = 1 + (rec - 1) / (sOff + 1);
        int temp2 = 1 + (col - 1) / (gOff + 1);
        System.out.println(temp1*temp2);
    }
}
