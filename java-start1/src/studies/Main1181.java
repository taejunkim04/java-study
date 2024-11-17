package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int caseCou = Integer.parseInt(reader.readLine());
        String[] words = new String[caseCou];

        for (int i = 0; i < caseCou; i++) {
            String temp = reader.readLine();
            words[i] = temp;
        }
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else {
                    return o1.length() - o2.length();
                }
            }
        });
        String lastWord = words[0];
        sb.append(lastWord).append("\n");

        for (int i = 1; i < caseCou; i++) {
            if (!lastWord.equals(words[i])) {
                sb.append(words[i]).append("\n");
                lastWord = words[i];
            }
        }
        System.out.println(sb);
    }
}
