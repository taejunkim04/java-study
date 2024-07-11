package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2441 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        for (int i = 0; i < count; i++) {
            int space = count - i;
            for (int j = space; j < count; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < count; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
