package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main4949 {
    static String s;
    static boolean fair;
    static Stack<Boolean> check = new Stack<>();
    //( : true, [ : false
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        s = reader.readLine();
        while (!s.equals(".")) {
            fair = checkMethod(s);
            check.removeAllElements();
            if (fair) {
                sb.append("yes").append("\n");
            } else {
                sb.append("no").append("\n");
            }
            s = reader.readLine();
        }
        System.out.println(sb);
    }
    static boolean checkMethod(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            char temp = s.charAt(i);
            if (temp == 40 ) {
                check.add(true);
            }else if (temp == 91) {
                check.add(false);
            }else if (temp==41) {
                if (check.isEmpty()) {
                    return false;
                }
                if (!check.pop()) {
                    return false;
                }
            } else if (temp==93) {
                if (check.isEmpty()) {
                    return false;
                }
                if (check.pop()) {
                    return false;
                }
            }
        }
        return check.isEmpty();
    }
}
