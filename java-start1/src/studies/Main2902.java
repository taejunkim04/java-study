package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2902 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine(), "-");
        StringBuilder sb = new StringBuilder();
        while (tk.countTokens() != 0) {
            String s = tk.nextToken();
            sb.append(s.charAt(0));
        }
        System.out.println(sb);
    }
}
