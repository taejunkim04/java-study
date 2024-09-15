package study3;

public class Methods {
    String name;

    Methods() {
        name = "홍길동";
        System.out.printf("#생성자: %s\n", name);
    }

    void printName() {
        System.out.printf("#printName() : %s\n", name);
    }
    void printName(String name) {
        System.out.printf("#printName(String name) : %s\n", name);
    }
    void printName(String...name) {
        System.out.println("#printNames(String...name)");
        for (String string : name) {
            System.out.println(string);
        }
    }

    int calc(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Methods m = new Methods();
        m.printName();
        m.printName("김길동");
        m.printName("아무개", "홍길동", "김사랑");
        System.out.printf("#calc(int num1, int num2) : %d ", m.calc(20, 50));
    }
}
