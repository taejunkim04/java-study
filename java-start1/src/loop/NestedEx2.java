package loop;

public class NestedEx2 {

    public static void main(String[] args) {
        int row = 5;
        for (int j=1; j<= row; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
