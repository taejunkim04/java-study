package study3;

public class Variables {
    int num1;
    static int num2;

    public void printName(String name) {
        String prtMag = name + " Hello";
        System.out.println(prtMag);
    }

    public static void main(String[] args) {
        Variables mc = new Variables();
        mc.num1 = 100;
        Variables.num2 = 50;
        mc.printName("내 이름");
        System.out.printf("%d, %d", mc.num1, Variables.num2);
    }
}
