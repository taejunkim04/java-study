package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main2605 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        ArrayList<Integer> students = new ArrayList<>();

        for (int i = 1; i <= count; i++) {
            students.add(Integer.parseInt(tk.nextToken()), i);
        }
        for (int i = count - 1; i >= 0; i--) {
            System.out.print(students.get(i) + " ");
        }
    }
}
