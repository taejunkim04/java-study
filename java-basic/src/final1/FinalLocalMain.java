package final1;

public class FinalLocalMain {

    public static void main(String[] args) {
        //final 지역 변수
        final int data1;
        data1 = 10;
        //data1 = 29;

        final int ata2 = 10;
        //ata2 = 10;
        method(11);

    }

    static void method(final int parameter) {
        //parameter = 20;
    }
}
