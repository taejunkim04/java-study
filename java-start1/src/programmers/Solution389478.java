package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution389478 {
    //택배 상자 꺼내기(lv1)
    //꺼내려는 상자 포함 위의 몇 개를 꺼내야 하는지
    public int solution(int n, int w, int num) {
        int answer;
        int numHe = num / w;
        if (num % w != 0) {
            numHe += 1;
        }
        int maxHe = n / w;
        if (n % w != 0) {
            maxHe += 1;
        }
        int locNum, locMax;
        if (numHe % 2 == 0) {
            locNum = w + 1 - num % w;
        } else {
            locNum = num % w + 1;
        }
        if (maxHe % 2 == 0) {
            locMax = w + 1 - n % w;
        } else {
            locMax = n % w + 1;
        }
        answer = maxHe - numHe;

        if (maxHe % 2 == 0) {
            if (locMax <= locNum) {
                answer += 1;
            }
        } else {
            if (locMax >= locNum) {
                answer += 1;
            }
        }
        return answer;
    }
}
