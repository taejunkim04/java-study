package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1049 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        int cut = Integer.parseInt(tk.nextToken());
        int brand = Integer.parseInt(tk.nextToken());

        int cost = 0;//비용
        int sixPak = Integer.MAX_VALUE;//가장 저렴한 6팩
        int one = Integer.MAX_VALUE;//가장 저렴한 1개

        for (int i = 0; i < brand; i++) {
            tk = new StringTokenizer(reader.readLine());
            int tempS = Integer.parseInt(tk.nextToken());
            int tempO = Integer.parseInt(tk.nextToken());
            if (sixPak > tempS) {
                sixPak = tempS;
            }
            if (one > tempO) {
                one = tempO;
            }
        }

        while (cut > 0) {
            if (cut >= 6) {
                if (sixPak <= one * 6) {
                    while (cut >= 6) {
                        cost += sixPak;
                        cut -= 6;
                    }
                } else {
                    cost += one * cut;
                    break;
                }
            } else {
                if (sixPak <= cut * one) {
                    cost += sixPak;
                    break;
                } else {
                    cost += cut * one;
                    break;
                }
            }
        }
        System.out.println(cost);
    }
}
