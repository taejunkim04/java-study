package study10try_catch;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionBasic {
    public void methodA(String filename) throws FileNotFoundException {
        if (filename != null) {
            System.out.println("파일명: " + filename.toUpperCase());
        }
    }

    public void methodB() throws IOException {
        throw new IOException("입출력 예외 발생!!");
    }

    public static void main(String[] args) {
        ExceptionBasic eb = new ExceptionBasic();
        try {
            eb.methodA(null);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
