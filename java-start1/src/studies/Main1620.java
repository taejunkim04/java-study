package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main1620 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        int lib = Integer.parseInt(tk.nextToken());
        int que = Integer.parseInt(tk.nextToken());

        String[] names = new String[lib];
        HashMap<String, Integer> nameToIndex = new HashMap<>();

        for (int i = 0; i < lib; i++) {
            names[i] = reader.readLine();
            nameToIndex.put(names[i], i + 1);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < que; i++) {
            String s = reader.readLine();
            if (Character.isDigit(s.charAt(0))) {
                int temp = Integer.parseInt(s);
                sb.append(names[temp - 1]).append("\n");
            } else {
                sb.append(nameToIndex.get(s)).append("\n");
            }
        }

        System.out.println(sb);
    }
}
