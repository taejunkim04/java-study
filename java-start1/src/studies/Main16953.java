package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main16953 {
    public static int hole;
    public static int out;
    public static boolean[] values;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        long one = Integer.parseInt(tk.nextToken());
        hole = Integer.parseInt(tk.nextToken());
        values = new boolean[35];
        value(one, 1);

        for (int i = 1; i < values.length; i++) {
            if (values[i]) {
                System.out.println(i);
                return;
            }
        }//가장 적은 값을 출력
        //값이 존재하지 않았을 경우 -1
        System.out.println(-1);
    }
    public static void value(long self,int dep) {
        //dfs 알고리즘 적용
        if (self > hole) {
            return;//목표값 보다 클경우 반환
        } else if (self == hole) {
            values[dep] = true;//횟수를 기록
            return;
        } else {
            value(self * 2, dep + 1);
            value(self * 10 + 1, dep + 1);
        }
    }
}
