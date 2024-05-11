package static1;

public class Data3 {
    public String name;//멤버 변수, 인스턴스 변수
    public static int count;//멤버 변수, 클래스 변수(정적 변수, static 변수)

    public Data3(String name) {
        this.name = name;
        count++;
    }
}
