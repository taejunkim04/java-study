package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main5525 {
    //IOIOI
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(reader.readLine());
        long sLength = (Long.parseLong(reader.readLine()));
        String string = reader.readLine();
        boolean last = false;
        Queue<Integer> queue = new LinkedList<>();
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'I') {
                if (!last) {
                    count++;
                } else {
                    if (count >= 3) {
                        queue.add(lenN(count));
                    }
                    count = 1;
                }
                last = true;
            } else {
                if (last) {
                    count++;
                } else {
                    if (count > 2) {
                        queue.add(lenN(count));
                    }
                    count = 0;
                }
                last = false;
            }
        }
        if (count > 2) {
            queue.add(lenN(count));
        }
        long res = 0;
        for (Integer i : queue) {
            if (i / 2 >= n) {
                res += ((long)(i / 2) - n) + 1;
            }
        }
        System.out.println(res);
    }

    static int lenN(int num) {
        if (num % 2 == 0) {
            return num - 2;
        } else {
            return num - 1;
        }
    }
}
