package study7.quiz1;

public class CellPhone {
    private String phoneNum;

    public CellPhone() {

    }
    public CellPhone(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void callTo(Person receiver) {
        System.out.println("전화걸기 " + receiver.getName() + "-" + receiver.getCellPhone().getPhoneNum());
    }

    // 전화 받기 메소드
    public void receiveFrom(Person caller) {
        System.out.println("전화수신 " + caller.getName() + "-" + caller.getCellPhone().getPhoneNum());
    }

    public String getPhoneNum() {
        return phoneNum;
    }
}
