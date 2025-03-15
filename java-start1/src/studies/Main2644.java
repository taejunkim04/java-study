package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2644 {
    //촌수계산
    static int perCou,startNum, endNum, nodeCou;
    static boolean[][] map;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        perCou = Integer.parseInt(reader.readLine());
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        startNum = Integer.parseInt(tk.nextToken());
        endNum = Integer.parseInt(tk.nextToken());
        nodeCou = Integer.parseInt(reader.readLine());
        map = new boolean[perCou + 1][perCou + 1];
        for (int i = 0; i < nodeCou; i++) {
            tk = new StringTokenizer(reader.readLine());
            map[Integer.parseInt(tk.nextToken())][Integer.parseInt(tk.nextToken())] = true;
        }
        
    }
}
