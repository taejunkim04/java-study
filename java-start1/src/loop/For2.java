package loop;

public class For2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        
        for (;;i++){
            sum += i;
            if (sum>10){
                System.out.println("i = " + i);
                break;
            }
        }
    }
}
