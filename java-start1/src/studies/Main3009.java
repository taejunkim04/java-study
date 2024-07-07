package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main3009 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] xArr = new int[3];
        int[] yArr = new int[3];
        for (int i = 0; i < 3; i++) {
            StringTokenizer tk = new StringTokenizer(reader.readLine());
            xArr[i] = Integer.parseInt(tk.nextToken());
            yArr[i] = Integer.parseInt(tk.nextToken());
        }
        int xResult;
        int yResult;
        if (xArr[0] == xArr[1]) {
            xResult = xArr[2];
        } else if (xArr[0] == xArr[2]) {
            xResult = xArr[1];
        } else {
            xResult = xArr[0];
        }
        if (yArr[0] == yArr[1]) {
            yResult = yArr[2];
        } else if (yArr[0] == yArr[2]) {
            yResult = yArr[1];
        } else {
            yResult = yArr[0];
        }
        System.out.println(xResult + " " + yResult);
    }
}
