package studies;

import java.util.Scanner;

//브루트포스 알고리즘
public class Main1476 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int e = scanner.nextInt();//1~15
        int s = scanner.nextInt();//1~28
        int m = scanner.nextInt();//1~19
        int we=0, ws=0, wm=0;
        int resultYear=0;
        while (true) {
            we++;
            ws++;
            wm++;
            resultYear++;
            if (we > 15) {
                we = 1;
            }
            if (ws > 28) {
                ws = 1;
            }
            if (wm > 19) {
                wm = 1;
            }
            if (we == e && ws == s && wm == m) {
                System.out.println(resultYear);
                break;
            }
        }
    }
}
