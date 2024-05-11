package method.ex;

public class MethodEx3 {

    public static void main(String[] args) {
        int balance = 10000;
        balance = depositAmount(balance, 1000);//압금
        balance = withdrawAmount(balance, 2000);//출금
    }

    public static int depositAmount(int bal,int a) {
        bal += a;
        System.out.println(a + "원을 입금하였습니다. 현재 잔액: " + bal + "원");
        return bal;
    }

    public static int withdrawAmount(int bal, int amount) {
        if (bal >= amount) {
            bal -= amount;
            System.out.println(amount+"원을 출금하였습니다. 현재 잔액: "+bal+"원");
        } else {
            System.out.println(+amount+"원을 출금하려 했으나 잔액이 부족합니다.");
            System.out.println("현재 잔액은 "+bal+"원입니다.");
        }
        return bal;
    }

}
