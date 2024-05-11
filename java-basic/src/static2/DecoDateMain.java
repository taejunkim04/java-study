package static2;

//import static static2.DecoData.staticCall;
public class DecoDateMain {

    public static void main(String[] args) {
        System.out.println("1.정적 호출");
        DecoData.staticCall();
        //staticCall();

        System.out.println("2. 인스턴스 호출");
        DecoData data = new DecoData();
        data.instanceCall();

        System.out.println("2. 인스턴스 호출");
        DecoData data2 = new DecoData();
        data2.instanceCall();
        
        //인스턴스를 통한 접근
        DecoData data3 = new DecoData();
        data3.staticCall();

        //클래스를 통한 접슨
        DecoData.staticCall();
    }
}
