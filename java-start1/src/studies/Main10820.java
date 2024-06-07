package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10820 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        //입력되는 다음값이 비어 있지 않을 경우 실행
        while ((str = reader.readLine()) != null) {
            StringBuilder builder = new StringBuilder();
            int[] arr = new int[4];//소문자, 대문자, 숫자, 공백
            for (int i = 0; i < str.length(); i++) {
                char at = str.charAt(i);
                if (at == ' ') {
                    arr[3]++;
                    continue;
                }//공백 처리
                int temp = (int) at;
                if (temp >= 65 && temp <= 90) {
                    arr[1]++;//대문자 처리
                } else if (temp >= 97 && temp <= 122) {
                    arr[0]++;//소문자 처리
                } else if (temp >= 48 && temp <= 57) {
                    arr[2]++;//숫자 처리
                }
            }
            for (int i : arr) {
                builder.append(i + " ");
            }//출력 형태 처리
            System.out.println(builder);
        }
    }
}//다음문제 11656
