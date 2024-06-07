package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        int[] arr = new int[count];
        int foPointer = 0;
        int backPointer = 0;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            String string = tokenizer.nextToken();
            if (string.equals("push")) {
                arr[backPointer] = Integer.parseInt(tokenizer.nextToken());
                backPointer++;
            } else if (string.equals("pop")) {
                if (foPointer + 1 > backPointer) {
                    builder.append(-1).append("\n");
                } else {
                    builder.append(arr[foPointer]).append("\n");
                    foPointer++;
                }
            }else if (string.equals("size")) {
                builder.append(backPointer - foPointer).append("\n");
            }else if (string.equals("empty")) {
                if (foPointer == backPointer) {
                    builder.append(1).append("\n");
                } else {
                    builder.append(0).append("\n");
                }
            }else if (string.equals("front")) {
                if (foPointer + 1 > backPointer) {
                    builder.append(-1).append("\n");
                } else {
                    builder.append(arr[foPointer]).append("\n");
                }
            } else if (string.equals("back")) {
                if (foPointer + 1 > backPointer) {
                    builder.append(-1).append("\n");
                } else {
                    builder.append(arr[backPointer - 1]).append("\n");
                }
            }
        }
        System.out.println(builder);
    }
}
