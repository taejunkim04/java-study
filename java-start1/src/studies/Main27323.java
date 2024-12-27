package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main27323 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int value1 = Integer.parseInt(reader.readLine());
        int value2 = Integer.parseInt(reader.readLine());
        System.out.println(value1*value2);
    }
}
