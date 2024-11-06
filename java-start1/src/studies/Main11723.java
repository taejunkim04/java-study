package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int caseCou = Integer.parseInt(reader.readLine());
        StringTokenizer tk;
        HashSet<Integer> values = new HashSet<>();

        for (int i = 0; i < caseCou; i++) {
            tk = new StringTokenizer(reader.readLine());
            String s = tk.nextToken();
            switch (s) {
                case "add" -> {
                    values.add(Integer.parseInt(tk.nextToken()));
                }
                case "remove" -> {
                    values.remove(Integer.parseInt(tk.nextToken()));
                }
                case "check" -> {
                    if (values.contains(Integer.parseInt(tk.nextToken()))) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                }
                case "toggle" -> {
                    int temp = Integer.parseInt(tk.nextToken());
                    if (values.contains(temp)) {
                        values.remove(temp);
                    } else {
                        values.add(temp);
                    }
                }
                case "all" -> {
                    for (int j = 1; j <= 20; j++) {
                        values.add(j);
                    }
                }
                default -> {
                    values.clear();
                }
            }
        }
        System.out.println(sb);
    }
}
