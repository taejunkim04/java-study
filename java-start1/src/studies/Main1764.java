package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        int listen = Integer.parseInt(tk.nextToken());
        int see = Integer.parseInt(tk.nextToken());

        String[] listenArr = new String[listen];
        Set<String> seeSet = new HashSet<>();

        for (int i = 0; i < listen; i++) {
            listenArr[i] = reader.readLine();
        }
        for (int i = 0; i < see; i++) {
            seeSet.add(reader.readLine());
        }

        SortedSet<String> sortedSet = new TreeSet<>();
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (int i = 0; i < listen; i++) {
            if (seeSet.contains(listenArr[i])) {
                count++;
                sortedSet.add(listenArr[i]);
            }
        }
        for (String string : sortedSet) {
            sb.append(string).append("\n");
        }
        System.out.println(count);
        System.out.println(sb);
    }
}
