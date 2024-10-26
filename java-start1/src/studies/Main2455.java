package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main2455 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int caseCount = Integer.parseInt(reader.readLine());
        StringTokenizer tk;
        for (int i = 0; i < caseCount; i++) {
            int clo = Integer.parseInt(reader.readLine());
            HashMap<String, Integer> typeList = new HashMap<>();
            for (int j = 0; j < clo; j++) {
                tk = new StringTokenizer(reader.readLine());
                tk.nextToken();
                String kind = tk.nextToken();
                if (typeList.containsKey(kind)) {
                    typeList.put(kind, typeList.get(kind) + 1);
                } else {
                    typeList.put(kind, 1);
                }
            }
            int result = 1;
            for (Integer value : typeList.values()) {
                result *= (value + 1);
            }
            result--;
            System.out.println(result);

        }
    }
}
