package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main5585 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int price = Integer.parseInt(reader.readLine());
        int temp = 1000 - price;
        int count = 0;
        while (temp / 500 >= 1) {
            count++;
            temp -= 500;
        }
        while (temp / 100 >= 1) {
            count++;
            temp -= 100;
        }
        while (temp / 50 >= 1) {
            count++;
            temp -= 50;
        }
        while (temp / 10 >= 1) {
            count++;
            temp -= 10;
        }
        while (temp / 5 >= 1) {
            count++;
            temp -= 5;
        }
        count += temp;
        System.out.println(count);
    }
}
