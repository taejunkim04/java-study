package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main10953 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        for (int i = 0; i < count; i++) {
            StringTokenizer tk = new StringTokenizer(reader.readLine(),",");
            System.out.println(Integer.parseInt(tk.nextToken()) + Integer.parseInt(tk.nextToken()));
        }
    }
}
