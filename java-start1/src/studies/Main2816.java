package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2816 {
    //디지털 티비
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        StringBuilder sb = new StringBuilder();

        String[] list = new String[count];
        int point = 0;
        for (int i = 0; i < count; i++) {
            list[i]= reader.readLine();
        }
        boolean turn = false;
        while (true) {
            if (list[point].equals("KBS1")) {
                break;
            }
            point++;
            sb.append("1");
        }
        int cou = point;
        for (int i = 0; i < cou; i++) {
            String temp = list[point - 1];
            list[point - 1] = list[point];
            list[point] = temp;
            point--;
            sb.append("4");
        }
        while (true) {
            if (list[point].equals("KBS2")) {
                break;
            }
            point++;
            sb.append("1");
        }

        while (point != 1) {
            sb.append("4");
            point--;
        }

        System.out.println(sb);
    }
}
