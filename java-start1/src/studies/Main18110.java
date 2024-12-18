package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main18110 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int caseCount = Integer.parseInt(reader.readLine());
        int[] values = new int[caseCount];
        for (int i = 0; i < caseCount; i++) {
            values[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(values);

        double half = caseCount * 0.15;
        int intHalf = (int) ((half % 1) < 0.5 ? half / 1 : half / 1 + 1);
        int sum = 0;
        for (int i = intHalf; i < caseCount - intHalf; i++) {
            sum += values[i];
        }
        double avg = (double) sum / (caseCount - (intHalf * 2));
        int result = (int) ((avg % 1) < 0.5 ? avg / 1 : avg / 1 + 1);
        System.out.println(result);
    }
}
