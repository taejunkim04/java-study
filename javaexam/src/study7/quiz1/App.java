package study7.quiz1;

public class App {
    public static void main(String[] args) {
        Person kimSa = new Person("김사랑", new CellPhone("010-9876-5432"));
        Person hong = new Person("홍길동", new CellPhone("010-1234-5678"));

        hong.getCellPhone().callTo(kimSa);
        kimSa.getCellPhone().receiveFrom(hong);
    }
}
