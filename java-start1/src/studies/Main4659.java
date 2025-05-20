package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main4659 {
    //비밀번호 발음하기
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Set<Character> mosSet = new HashSet<>();
        mosSet.add('a');
        mosSet.add('e');
        mosSet.add('i');
        mosSet.add('o');
        mosSet.add('u');

        while (true) {
            String words = reader.readLine();
            if (words.equals("end")) {
                break;
            }

            boolean mo = false;
            boolean accept = true;
            Deque<Character> deque = new LinkedList<>();
            int moCou = 0;
            int jaCou = 0;
            for (int i = 0; i < words.length(); i++) {
                if (moCou > 2 || jaCou > 2) {
                    accept = false;
                    break;
                }
                if (!mo) {
                    if (mosSet.contains(words.charAt(i))) {
                        mo = true;
                    }
                }
                if (i == 0) {
                    deque.add(words.charAt(i));
                    if (mosSet.contains(words.charAt(i))) {
                        moCou++;
                    } else {
                        jaCou++;
                    }
                } else {
                    if (deque.getLast() == words.charAt(i)) {
                        if (words.charAt(i) != 'e' && words.charAt(i) != 'o') {
                            accept = false;
                            break;
                        }
                    }
                    if (mosSet.contains(words.charAt(i))) {
                        moCou++;
                        jaCou = 0;
                    } else {
                        jaCou++;
                        moCou = 0;
                    }
                    deque.add(words.charAt(i));
                }
            }
            if (moCou > 2 || jaCou > 2) {
                accept = false;
            }
            sb.append('<').append(words).append("> is ");
            if (mo && accept) {
                sb.append("acceptable.");
            } else {
                sb.append("not acceptable.");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
