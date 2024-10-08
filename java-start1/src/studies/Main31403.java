package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main31403 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();

        System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2) - Integer.parseInt(s3));
        System.out.println(Integer.parseInt(s1 + s2) - Integer.parseInt(s3));
    }
}
