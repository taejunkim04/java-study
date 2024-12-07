package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int allCardNum = Integer.parseInt(reader.readLine());
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < allCardNum; i++) {
            int temp = Integer.parseInt(tk.nextToken());
            if (map.containsKey(temp)) {
                map.put(temp, map.get(temp) + 1);
            } else {
                map.put(temp, 1);
            }
        }
        int checkNum = Integer.parseInt(reader.readLine());
        StringBuilder sb = new StringBuilder();
        tk = new StringTokenizer(reader.readLine());
        for (int i = 0; i < checkNum; i++) {
            int temp = Integer.parseInt(tk.nextToken());
            if (map.get(temp) == null) {
                sb.append(0).append(" ");
            } else {
                sb.append(map.get(temp)).append(" ");
            }
        }
        System.out.println(sb);
    }
}
