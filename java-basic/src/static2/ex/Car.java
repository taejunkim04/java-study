package static2.ex;

public class Car {
    private static int count;
    private String name;
    public Car(String name) {
        this.name = name;
        count++;
    }

    public static void showTotalCars() {
        System.out.println("구매한 차량 수"+count);
    }
}
