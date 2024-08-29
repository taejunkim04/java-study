package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main16439 {
    static int people, choose;
    static int result;
    static int[][]map;
    static boolean[] check;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());

        people = Integer.parseInt(tk.nextToken());
        choose = Integer.parseInt(tk.nextToken());

        map = new int[people][choose];

        check = new boolean[choose];
        for(int i = 0; i< people; i++){
            String[] s1 = reader.readLine().split(" ");
            for(int j = 0; j< choose; j++){
                map[i][j] = Integer.parseInt(s1[j]);
            }
        }

        dfs(0,0);

        System.out.println(result);

    }
    private static void dfs(int start, int depth){
        if(depth==3){
            int sum=0;
            for(int i = 0; i< people; i++){
                int temp=0;
                for(int j = 0; j< choose; j++){
                    if(check[j]){
                        temp = Math.max(temp, map[i][j]);
                    }
                }
                sum+=temp;
            }
            result = Math.max(sum,result);
            return;
        }

        for(int i = start; i< choose; i++){
            if(!check[i]){
                check[i]=true;
                dfs(i+1, depth+1);
                check[i]=false;
            }
        }
    }
}
