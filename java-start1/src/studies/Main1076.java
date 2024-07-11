package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1076 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s1 = reader.readLine();
        if (s1.equals("black")) {
        } else {
            sb.append(dha1(s1));
        }
        String s2 = reader.readLine();
        if (s1.equals("black") && s2.equals("black")) {
        } else {
            sb.append(dha1(s2));
        }
        String s = reader.readLine();
        if (s1.equals("black") && s2.equals("black") && s.equals("black")) {
            System.out.println(0);
        } else if (s.equals("black")) {
            System.out.println(sb);
        } else if (s1.equals("black") && s2.equals("black")) {
            System.out.println(0);
        } else {
            sb.append(dha2(s));
            System.out.println(sb);
        }
    }

    static int dha1(String string) {
        if (string.equals("black")) {
            return 0;
        } else if (string.equals("brown")) {
            return 1;
        } else if (string.equals("red")) {
            return 2;
        } else if (string.equals("orange")) {
            return 3;
        } else if (string.equals("yellow")) {
            return 4;
        } else if (string.equals("green")) {
            return 5;
        } else if (string.equals("blue")) {
            return 6;
        } else if (string.equals("violet")) {
            return 7;
        } else if (string.equals("grey")) {
            return 8;
        } else if (string.equals("white")) {
            return 9;
        }
        return 0;
    }
    static String dha2(String string) {
        if (string.equals("brown")) {
            return "0";
        } else if (string.equals("red")) {
            return "00";
        } else if (string.equals("orange")) {
            return "000";
        } else if (string.equals("yellow")) {
            return "0000";
        } else if (string.equals("green")) {
            return "00000";
        } else if (string.equals("blue")) {
            return "000000";
        } else if (string.equals("violet")) {
            return "0000000";
        } else if (string.equals("grey")) {
            return "00000000";
        } else if (string.equals("white")) {
            return "000000000";
        }
        return "";
    }
}
