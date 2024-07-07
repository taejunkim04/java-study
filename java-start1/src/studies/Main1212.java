package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1212 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        StringBuilder sb = new StringBuilder();
        /* java 11 버전에서는 지원하지 않는 switch문 형식
        첫 수개ㅏ 0인 경우를 처리하지 않아 오답이 발생
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '0' ->
                    sb.append("000");
                case '1' ->
                    sb.append("001");
                case '2' ->
                    sb.append("010");
                case '3' ->
                    sb.append("011");
                case '4' ->
                    sb.append("100");
                case '5' ->
                    sb.append("101");
                case '6' ->
                    sb.append("110");
                case '7' ->
                    sb.append("111");
            }
        }*/
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '0':
                    sb.append("000");
                    break;
                case '1':
                    sb.append("001");
                    break;
                case '2':
                    sb.append("010");
                    break;
                case '3':
                    sb.append("011");
                    break;
                case '4':
                    sb.append("100");
                    break;
                case '5':
                    sb.append("101");
                    break;
                case '6':
                    sb.append("110");
                    break;
                case '7':
                    sb.append("111");
                    break;
            }
        }
        if (s.charAt(0) == '1') {
            sb.delete(0, 2);
        } else if (s.charAt(0) == '2' || s.charAt(0) == '3') {
            sb.delete(0, 1);
        } else if (s.charAt(0) == '0') {
            sb.delete(0, 2);
        }
        System.out.println(sb);
    }
}
