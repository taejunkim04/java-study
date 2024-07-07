package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2747 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        int result = 1;
        int firstNum = 0;
        int secondNum = 1;
        for (int i = 1; i < count; i++) {
            result = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = result;
        }
        System.out.println(result);
    }
}
