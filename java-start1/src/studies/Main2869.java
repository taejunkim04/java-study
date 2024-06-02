package studies;

import java.util.Scanner;
public class Main2869 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int up = scanner.nextInt();
        int down = scanner.nextInt();
        int high = scanner.nextInt();
        int day = 0;
        while (true) {
            if ((high-up) - (up - down) * 100 > 0) {
                day += 100;
                high -= (up - down) * 100;
                continue;
            }
            if ((high-up)- (up - down) * 50 > 0) {
                day += 50;
                high -= (up - down) * 50;
                continue;
            }
            if ((high-up)- (up - down) * 10 > 0) {
                day += 10;
                high -= (up - down) * 10;
                continue;
            }
            if ((high-up)- (up - down) * 5 > 0) {
                day += 5;
                high -= (up - down) * 5;
                continue;
            }
            day++;
            high -= up;
            if (high <= 0) {
                break;
            }
            high += down;
        }
        System.out.println(day);
    }
}
