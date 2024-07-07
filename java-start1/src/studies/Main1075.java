package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1075 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int mainNum = Integer.parseInt(reader.readLine());
        int divNum = Integer.parseInt(reader.readLine());
        mainNum -= mainNum % 100;
        while (true) {
            if (mainNum % divNum == 0) {
                if (mainNum % 100 < 10) {
                    System.out.println("0" + mainNum % 100);
                } else {
                    System.out.println(mainNum%100);
                }
                break;
            }
            mainNum++;
        }
    }
}
