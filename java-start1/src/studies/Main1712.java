package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1712 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int firstNum = Integer.parseInt(tokenizer.nextToken());//고정비
        int secondNum = Integer.parseInt(tokenizer.nextToken());//가변비용
        int thirdNum = Integer.parseInt(tokenizer.nextToken());//가격
        int value = thirdNum - secondNum;
        if (secondNum >= thirdNum) {
            System.out.println(-1);
        } else {
            int result = firstNum / value + 1;
            System.out.println(result);
        }
    }
}
