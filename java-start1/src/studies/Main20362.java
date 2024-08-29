package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main20362 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        int line = Integer.parseInt(tk.nextToken());
        String winner = tk.nextToken();
        String rightAnswer = " ";
        String[] answers = new String[line];
        for (int i = 0; i < line; i++) {
            tk = new StringTokenizer(reader.readLine());
            String name = tk.nextToken();
            String answer = tk.nextToken();
            if (winner.equals(name)) {
                rightAnswer = answer;
                break;
            }
            answers[i] = answer;
        }

        int count = 0;
        for (String answer : answers) {
            if (rightAnswer.equals(answer)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
