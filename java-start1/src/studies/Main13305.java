package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main13305 {
    public static int[] node;
    public static int[] towns;
    public static int price;
    public static int town;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        town = Integer.parseInt(reader.readLine());
        node = new int[town - 1];
        towns = new int[town];
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        for (int i = 0; i < town - 1; i++) {
            node[i] = Integer.parseInt(tk.nextToken());
        }//사이 거리 입력
        tk = new StringTokenizer(reader.readLine());
        for (int i = 0; i < town; i++) {
            towns[i] = Integer.parseInt(tk.nextToken());
        }//각 마을의 가격 입력

        price = 0;
        soil();
        System.out.println(price);
    }

    public static void soil() {
        int chipPrice = 1000000001;
        for (int i = 0; i < town - 1; i++) {
            //현재 도시의 가격이 이전 가격의 도시보다 저렴할 경우
            if (towns[i] < chipPrice) {
                chipPrice = towns[i];
                price += towns[i] * node[i];
            } else {
                price += chipPrice * node[i];
            }//이전 도시의 가격이 현재보다 저렴할 경우
        }
    }
}
