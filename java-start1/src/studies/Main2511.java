package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2511 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] valuesA = new int[10];
        int[] res = new int[10];
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        for (int i = 0; i < 10; i++) {
            valuesA[i] = Integer.parseInt(tk.nextToken());
        }
        tk = new StringTokenizer(reader.readLine());
        int resA = 0;
        int resB = 0;
        for (int i = 0; i < 10; i++) {
            int temp = Integer.parseInt(tk.nextToken());
            if (valuesA[i] < temp) {
                resB += 3;
                res[i] = 2;
            } else if (valuesA[i] > temp) {
                resA += 3;
                res[i] = 1;
            } else {
                res[i] = 3;
                resA++;
                resB++;
            }
        }
        System.out.println(resA + " " + resB);
        if (resA > resB) {
            System.out.println("A");
        } else if (resA < resB) {
            System.out.println("B");
        } else {
            int allD = 0;
            for (int i = 9; i >= 0; i--) {
                if (res[i] == 1) {
                    System.out.println("A");
                    break;
                } else if (res[i] == 2) {
                    System.out.println("B");
                    break;
                } else {
                    allD++;
                }
            }
            if (allD == 10) {
                System.out.println("D");
            }
        }
    }
}
