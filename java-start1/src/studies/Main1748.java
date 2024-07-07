package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1748 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        int length = 1;  // 자릿수를 나타냄
        int range = 9;   // 현재 자릿수 범위 내 최대 숫자
        int result = 0;  // 최종 결과 저장
        int temp = 0;    // 현재 범위의 하한값 저장

        while (count > temp + range) {
            result += (range * length);  // 현재 범위의 자릿수 총합 더하기
            temp += range;  // 다음 범위로 이동
            length++;       // 자릿수 증가
            range *= 10;    // 다음 자릿수 범위 갱신
        }
        result += (count - temp) * length;
        System.out.println(result);
    }
}
