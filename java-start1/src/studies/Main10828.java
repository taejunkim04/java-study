package studies;

import java.util.Scanner;

public class Main10828 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int pointer = 0;
        int[] array = new int[count];
        StringBuilder out = new StringBuilder();
        String str;
        for (int i = 0; i < count; i++) {
            str = scanner.next();
            if (str.equals("push")) {
                array[pointer] = scanner.nextInt();
                pointer++;
            }
            if (str.equals("pop")) {
                if (pointer == 0) {
                    out.append(-1).append("\n");
                } else {
                    out.append(array[pointer-1]).append("\n");
                    pointer--;
                }
            }
            if (str.equals("size")) {
                out.append(pointer).append("\n");
            }
            if (str.equals("empty")) {
                if (pointer == 0) {
                    out.append(1).append("\n");
                } else {
                    out.append(0).append("\n");
                }
            }
            if (str.equals("top")) {
                if (pointer == 0) {
                    out.append(-1).append("\n");
                } else {
                    out.append(array[pointer-1]).append("\n");
                }
            }
        }
        System.out.println(out);
    }
}