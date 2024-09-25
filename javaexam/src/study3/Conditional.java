package study3;

import java.util.Scanner;

public class Conditional {
    void login() {
        Scanner scan = new Scanner(System.in);

        System.out.print("## 아이디를 입력하세요: ");
        String uname = scan.next();

        System.out.print("# 비밀번호를 입력하세요: ");
        String pwd = scan.next();

        if(uname.equals("hong") && pwd.equals("1234")) {
            System.out.println("인증 확인!! -> 로그인 성공");
        }
        else {
            System.out.println("아이디나 비밀번호가 틀렸습니다.!!");
        }
    }

    void check() {
        int cnt = 10;
        String msg = cnt > 0 ? "새로운 쪽지가 있습니다.!!" : "새로운 쪽지가 없습니다.!!";
        System.out.println(msg);
    }
    void out() {
        System.out.println("시스템을 종료합니다.");
        System.exit(0);
    }
    public static void main(String[] args) {
        Conditional con = new Conditional();

        while(true) {
            System.out.print("# 메뉴를 선택하세요 (1:로그인, 2:쪽지확인, x:종료) ==> ");
            Scanner scan = new Scanner(System.in);
            String sel = scan.next();

            /* switch 문은 다음과 같이 두가지 유형중 선택해서 사용 가능
            switch(sel) {
                case "1": con.login();break;
                case "2": con.check();break;
                case "x": System.exit(0);
                default : System.out.println("잘못된 입력 입니다.!!");
            }
            */
            switch(sel) {
                case "1" -> con.login();
                case "2" -> con.check();
                case "x" -> con.out();
                default -> System.out.println("잘못된 입력 입니다.!!");
            }
        }
    }
}
