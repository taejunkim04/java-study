package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main28702 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = reader.readLine();
        }
        int resCou = 0;
        for (int i = 0; i < 3; i++) {
            if (arr[i].equals("Fizz") || arr[i].equals("Buzz") || arr[i].equals("FizzBuzz")) {

            } else {
                resCou = Integer.parseInt(arr[i]) + (3 - i);
            }
        }

        if (resCou % 3 == 0 && resCou % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (resCou % 3 == 0) {
            System.out.println("Fizz");
        } else if (resCou % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(resCou);
        }
    }
}
