package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1267 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int caseCount = Integer.parseInt(reader.readLine());
        int youngRes = 0;
        int minRes = 0;

        StringTokenizer tk = new StringTokenizer(reader.readLine());
        for (int i = 0; i < caseCount; i++) {
            int temp = Integer.parseInt(tk.nextToken());
            youngRes += ((temp / 30) + 1) * 10;
            minRes += ((temp / 60) + 1) * 15;
        }
        if (youngRes == minRes) {
            System.out.println("Y M "+youngRes);
        } else if (youngRes > minRes) {
            System.out.println("M " + minRes);
        } else {
            System.out.println("Y "+youngRes);
        }
    }
}
