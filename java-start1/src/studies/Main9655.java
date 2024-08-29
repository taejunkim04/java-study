package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main9655 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int inValue = Integer.parseInt(reader.readLine());

        inValue = inValue % 4;
        if (inValue == 1 || inValue == 3) {
            System.out.println("SK");
        } else {
            System.out.println("CY");
        }
    }
}
