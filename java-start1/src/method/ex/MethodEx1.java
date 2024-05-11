package method.ex;

public class MethodEx1 {

    public static void main(String[] args) {
        add(1, 2, 3);
        add(15, 25, 35);
    }

    public static void add(int a, int b, int c) {
        int sum = a + b + c;
        double avg = sum / 3.0;
        System.out.println("평균값: "+avg);
    }
}
