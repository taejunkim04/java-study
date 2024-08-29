package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1789 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long mainValue = Long.parseLong(reader.readLine());
        int count = 1;
        while (mainValue >= count) {
            mainValue -= count;
            count++;
        }
        count--;
        System.out.println(count);
    }
}
