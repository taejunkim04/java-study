package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1157 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int[] alphas = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int temp = (int) s.charAt(i)-65;
            if (temp >= 26) {
                temp -= 32;
            }
            alphas[temp]++;
        }
        int point = -1;
        int value = -1;
        boolean coupleCase = false;
        for (int i = 0; i < alphas.length; i++) {
            if (alphas[i] > value) {
                value = alphas[i];
                point = i;
                coupleCase = false;
            } else if (alphas[i] == value) {
                coupleCase = true;
            }
        }
        if (coupleCase) {
            System.out.println("?");
        } else {
            System.out.println((char) (point + 65));
        }
    }
}
