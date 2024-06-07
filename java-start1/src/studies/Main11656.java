package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String[] strings = new String[str.length()];
        strings[0] = str;
        for (int i = 1; i < str.length(); i++) {
            strings[i] = strings[i - 1].substring(1);
        }
        Arrays.sort(strings);
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
