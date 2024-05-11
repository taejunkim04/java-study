package method;

public class MethodReturn2 {

    public static void main(String[] args) {
        checkAge(10);
        checkAge(20);
    }

    public static void checkAge(int i) {
        if (i < 18) {
            System.out.println("미성년자는 출입이 불가합니다.");
        } else {
            System.out.println("입장하세요.");
        }
    }

}
