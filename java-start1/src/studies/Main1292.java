package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(tk.nextToken());
        int m = Integer.parseInt(tk.nextToken());

        int count = 1;
        int idx = 1;
        int result = 0;
        while(idx <= m){
            for(int i = 0; i < count; i++){
                if(n <= idx && idx <= m)
                    result += count;
                idx++;
            }
            count++;
        }
        System.out.println(result);
    }
}
