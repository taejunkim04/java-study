package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        StringBuilder builder = new StringBuilder();
        int[] arr = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char at = str.charAt(i);
            int temp = (int) at;
            temp -= 97;
            arr[temp]++;
        }
        for (int i : arr) {
            builder.append(i + " ");
        }
        System.out.println(builder);
    }
}
