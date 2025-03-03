package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main10815 {
    //숫자 카드
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int haveCou = Integer.parseInt(reader.readLine());
        Set<Integer> set = new HashSet<>();
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        for (int i = 0; i < haveCou; i++) {
            set.add(Integer.parseInt(tk.nextToken()));
        }
        int queCou = Integer.parseInt(reader.readLine());
        tk = new StringTokenizer(reader.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < queCou; i++) {
            if (set.contains(Integer.parseInt(tk.nextToken()))) {
                sb.append("1 ");
            } else {
                sb.append("0 ");
            }
        }
        System.out.println(sb);
    }
}
