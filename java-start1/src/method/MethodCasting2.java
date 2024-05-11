package method;

public class MethodCasting2 {

    public static void main(String[] args) {
        int number = 100;
        printNumber((int) number);//자동 형변환 사용
    }

    public static void printNumber(double a)
    {
        System.out.println("숫자: " + a);
    }
}
