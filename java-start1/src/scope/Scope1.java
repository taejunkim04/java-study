package scope;

public class Scope1 {

    public static void main(String[] args) {
        int m = 10;
        if (true){
            int x = 20;//x 생존
            System.out.println("IF m = "+m);
            System.out.println("IF x = "+x);
        }
        //System.out.println("main x = "+x);
        System.out.println("main m = "+m);
    }
}
