package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main14501 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // 사용자로부터 입력을 받기 위한 BufferedReader 객체 생성
        int days = Integer.parseInt(reader.readLine());
        // 상담을 할 수 있는 총 일 수를 입력 받음
        int[] day = new int[days];
        int[] amount = new int[days];
        // 각 날에 걸리는 시간(day)과 그 날 상담을 완료했을 때 얻을 수 있는 수익(amount)을 저장할 배열 선언

        for (int i = 0; i < days; i++) {
            StringTokenizer tk = new StringTokenizer(reader.readLine());
            // 각 날에 대한 상담 기간과 수익을 입력 받음
            day[i] = Integer.parseInt(tk.nextToken());
            amount[i] = Integer.parseInt(tk.nextToken());
            // 입력 받은 값을 각각 day와 amount 배열에 저장
        }

        int[] dp = new int[days + 1];
        // 최대 수익을 저장하기 위한 동적 계획법(DP) 배열 선언, 크기는 days + 1

        for (int i = 0; i < days; i++) {
            if (i + day[i] <= days) {
                // 현재 상담을 시작했을 때, 상담이 퇴사 전까지 끝나는 경우
                dp[i + day[i]] = Math.max(dp[i + day[i]], dp[i] + amount[i]);
                // 현재 상담을 끝냈을 때의 수익과 이미 기록된 수익 중 큰 값을 선택
            }
            dp[i + 1] = Math.max(dp[i + 1], dp[i]);
            // 다음 날의 수익은 오늘까지의 수익과 비교하여 큰 값으로 갱신
        }

        System.out.println(dp[days]);
        // 최종적으로 퇴사 날까지 얻을 수 있는 최대 수익을 출력
    }
}
