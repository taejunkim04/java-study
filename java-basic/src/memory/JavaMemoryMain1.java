package memory;

public class JavaMemoryMain1 {

    public static void main(String[] args) {
        System.out.println("메인 스타트");
        method1(10);

        System.out.println("main end");

    }

    static void method1(int m1) {
        System.out.println("method1 start");
        int cal = m1 * 2;
        method2(cal);
        System.out.println("method1 end");
    }

    static void method2(int m2) {
        System.out.println("method2 stat");
        System.out.println("method2 end");
    }
}
