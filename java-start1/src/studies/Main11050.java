package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer tk = new StringTokenizer(reader.readLine());
        int mainNum = Integer.parseInt(tk.nextToken());
        int subNum = Integer.parseInt(tk.nextToken());
        int resultValue = 1;

        int count = 0;
        while (count < subNum) {
            resultValue *= mainNum;
            mainNum--;
            count++;
        }
        while (subNum > 0) {
            resultValue /= subNum;
            subNum--;
        }
        System.out.println(resultValue);
    }
}
