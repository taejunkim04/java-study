package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main10610 {
    //0이 하나 이상 존재해야 한다.
    //30의 배수는 각 자릿수의 모든 값의 합이 3의 배수이다.
    private static int[] values;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        values = new int[s.length()];
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int temp = s.charAt(i) - 48;
            values[i] = temp;
            sum += temp;
        }
        Arrays.sort(values);

        if (values[0] != 0 || sum % 3 != 0) {
            System.out.println(-1);
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(values[i]);
        }
        System.out.println(sb);
    }
}
