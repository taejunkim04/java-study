package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1568 {
    //새
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int day = 0;
        int birdCou = Integer.parseInt(reader.readLine());
        int num = 1;
        while (birdCou != 0) {
            if (num > birdCou) {
                num = 1;
                continue;
            } else if (num == birdCou) {
                day++;
                break;
            }
            birdCou -= num;
            num++;
            day++;
        }
        System.out.println(day);
    }
}
