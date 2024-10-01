package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main26069 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        String nameChong = "ChongChong";
        Queue<String> dancePeople = new LinkedList<>();
        boolean look = false;
        for (int i = 0; i < count; i++) {
            StringTokenizer tk = new StringTokenizer(reader.readLine());
            if (look) {
                String name1 = tk.nextToken();
                String name2 = tk.nextToken();
                boolean name1In = false, name2In = false;
                for (int j = 0; j < dancePeople.size(); j++) {
                    String s = dancePeople.peek();
                    dancePeople.add(dancePeople.poll());
                    if (!name1In && name1.equals(s)) {
                        name1In = true;
                    }
                    if (!name2In && name2.equals(s)) {
                        name2In = true;
                    }
                }
                if (name1In != name2In) {
                    if (name1In) {
                        dancePeople.add(name2);
                    } else {
                        dancePeople.add(name1);
                    }
                }
            } else {
                String name1 = tk.nextToken();
                String name2 = tk.nextToken();
                if (name1.equals(nameChong) || name2.equals(nameChong)) {
                    look = true;
                    dancePeople.add(name1);
                    dancePeople.add(name2);
                }
            }
        }
        System.out.println(dancePeople.size());
    }
}
