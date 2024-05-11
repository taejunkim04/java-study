package method.ex;

public class MethodEx2 {

    public static void main(String[] args) {
        String message = "Hello world!";
        printWord(3,message);
        printWord(5,message);
        printWord(7,message);
    }

    public static void printWord(int a, String b) {
        for (int i = 0; i < a; i++) {
            System.out.println((i+1)+"번째 호출 "+b);
        }
    }

}
