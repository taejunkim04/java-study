package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1969 {
    private static String[] ss;
    private static char[] acgtChar = {'A', 'C', 'G', 'T'};
    private static int n, m;
    private static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        n = Integer.parseInt(tk.nextToken());
        m = Integer.parseInt(tk.nextToken());
        sb = new StringBuilder();

        ss = new String[n];
        for (int i = 0; i < n; i++) {
            ss[i] = reader.readLine();
        }

        int sum = check();

        System.out.println(sb);
        System.out.println(sum);
    }

    private static int check() {
        int sum = 0;
        for (int i = 0; i < m; i++) {
            int[] acgt = new int[4];
            for (int j = 0; j < n; j++) {
                char temp = ss[j].charAt(i);
                switch (temp) {
                    case 'A':
                        acgt[0]++;
                        break;
                    case 'C':
                        acgt[1]++;
                        break;
                    case 'G':
                        acgt[2]++;
                        break;
                    case 'T':
                        acgt[3]++;
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
            }
            int max = 0;
            for (int i1 : acgt) {
                if (i1 > max) {
                    max = i1;
                }
            }
            for (int x = 0; x < 4; x++) {
                if (max == acgt[x]) {
                    sb.append(acgtChar[x]);
                    for (int y = 0; y < 4; y++) {
                        if (x != y) {
                            sum += acgt[y];
                        }
                    }
                    break;
                }
            };
        }
        return sum;
    }
}
