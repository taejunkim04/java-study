package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main17219 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        int listCount = Integer.parseInt(tk.nextToken());
        int lookCount = Integer.parseInt(tk.nextToken());

        HashMap<String, String> iAndBe = new HashMap<>();
        for (int i = 0; i < listCount; i++) {
            tk = new StringTokenizer(reader.readLine());
            iAndBe.put(tk.nextToken(), tk.nextToken());
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lookCount; i++) {
            sb.append(iAndBe.get(reader.readLine())).append("\n");
        }
        System.out.println(sb);
    }
}
