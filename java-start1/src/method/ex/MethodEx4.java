package method.ex;

import java.util.Scanner;

public class MethodEx4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bal = 0;
        while (true) {
            printMenu();
            int choice= scanner.nextInt();
            if (choice == 1) {
                System.out.print("입금액을 입력하세요: ");
                int amount = scanner.nextInt();
                bal=depos(bal,amount);
            } else if (choice==2) {
                System.out.print("출금액을 입력하세요: ");
                int amount = scanner.nextInt();
                bal = with(bal, amount);
            } else if (choice==3) {
                System.out.println("현재 잔액은 "+bal+"원");

            } else if (choice==4) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
    public static void printMenu() {
        System.out.println("__________________________________");
        System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
        System.out.println("__________________________________");
        System.out.print("선택: ");
    }

    public static int depos(int a,int amount) {
        a += amount;
        System.out.println(amount + "원을 입급하였습니다. 현재 잔액: " + a);
        return a;
    }

    public static int with(int a, int amount) {
        if (a >= amount) {
            a-=amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + a);
            return a;
        } else {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
            return a;
        }
    }
}
