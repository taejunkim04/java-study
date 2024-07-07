package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main14912 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int number = Integer.parseInt(st.nextToken());
        int countNumber = Integer.parseInt(st.nextToken());
        char countChar = (char) (countNumber+'0');
        int result = 0;
        String str;
        for (int i = 1; i <= number; i++) {
            str = String.valueOf(i);
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == countChar) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
