package access.a;

public class AccessInnerMain {

    public static void main(String[] args) {
        AccessData data = new AccessData();
        data.publicField = 1;
        data.publicMethod();

        data.defaultField = 5;
        data.defaultMethod();
        //private 호출 불가
        data.innerAccess();

    }
}