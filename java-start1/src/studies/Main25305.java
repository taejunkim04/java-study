package studies;

import java.util.Arrays;
import java.util.Scanner;

public class Main25305 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleCount = scanner.nextInt();//전체 응시자 수
        int cutLine = scanner.nextInt();//커트라인 인수
        int[] people = new int[peopleCount];
        for (int i = 0; i < peopleCount; i++) {
            people[i] = scanner.nextInt();
        }
        Arrays.sort(people);
        System.out.println(people[peopleCount - cutLine]);
    }
}
