package studies;

import java.io.*;
import java.util.StringTokenizer;

public class Main10973 {

    public static int[] outValue;
    public static boolean first;
    public static int inValue;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        inValue = Integer.parseInt(reader.readLine());
        outValue = new int[inValue];

        StringTokenizer tk = new StringTokenizer(reader.readLine());
        for (int i = 0; i < inValue; i++) {
            outValue[i] = Integer.parseInt(tk.nextToken());
        }
        first = previousPermutation();
        if (first) {
            for(int num : outValue){
                bw.write(String.valueOf(num) + " ");
            }
        } else {
            bw.write(String.valueOf(-1));
        }
        bw.flush();
        reader.close();
    }
    public static boolean previousPermutation() {
        int i = inValue-1;
        // 뒤에서부터 체크하여 현재 위치부터 오름차순이 시작되는 경우 중, 최대 i값을 구한다.
        // 오름차순이라는 것은 해당 위치 기준으로 뒤의 데이터는 최초 순열이라는 의미이다.
        while(i > 0 && outValue[i-1] <= outValue[i]) i--;

        // 이미 자체적으로 최초 순열이라면, false를 반환
        if(i <= 0) return false;

        // j는 현재 i위치에서 시작.
        // i 이후의 모든 숫자 중 i-1번째 보다 작은 것을 고르되, 가장 큰 것을 고른다.
        int j = i;
        while(j < inValue-1 && outValue[i-1] > outValue[j+1]) j++;

        // j와 i-1번째의 숫자를 swap
        swap(i-1, j);

        // 현재 i번째 부터 이후를 내림차순으로 뒤집음. 즉, n-1까지 뒤집는다.
        j = inValue-1;
        while(i < j){
            swap(i, j);
            i+=1; j-=1;
        }
        return true;
    }
    public static void swap(int x, int y) {
        int temp = outValue[x];
        outValue[x] = outValue[y];
        outValue[y] = temp;
    }
}
