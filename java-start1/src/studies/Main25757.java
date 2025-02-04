package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main25757 {
    //Y 2, F 3, O 4
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        Set<String> set = new HashSet<>();
        int count = Integer.parseInt(tk.nextToken());
        String game = tk.nextToken();
        int playHu;
        if (game.charAt(0) == 'Y') {
            playHu = 1;
        } else if (game.charAt(0) == 'F') {
            playHu = 2;
        } else {
            playHu = 3;
        }
        for (int i = 0; i < count; i++) {
            set.add(reader.readLine());
        }
        int res = set.size() / playHu;
        System.out.println(res);
    }
}
