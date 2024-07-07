package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main2751 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        boolean[] trueTable = new boolean[2000001];
        for (int i = 0; i < count; i++) {
            trueTable[Integer.parseInt(reader.readLine())+1000000] = true;
        }
        for (int i = 0; i < trueTable.length; i++) {
            if (trueTable[i]) {
                stringBuilder.append(i-1000000).append("\n");
            }
        }
        System.out.println(stringBuilder);
    }
}
