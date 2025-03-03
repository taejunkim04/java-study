package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10101 {
    //삼각형 외우기
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());

        if (num1 == num2 && num2 == num3 && num3 == 60) {
            System.out.println("Equilateral");
        } else if (num1 + num2 + num3 != 180) {
            System.out.println("Error");
        } else if (num1 != num2 && num2 != num3 && num1 != num3) {
            System.out.println("Scalene");
        } else {
            System.out.println("Isosceles");
        }
    }
}
