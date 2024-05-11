package static2.ex;

public class MathArrayUtils {
    private MathArrayUtils() {
        //인스턴스 생성 불가
    }

    public static int sum(int[] value) {
        int sum = 0;
        for (int i : value) {
            sum += i;
        }
        return sum;
    }
    public static double average(int[] value) {
        double sum = 0;
        for (int i : value) {
            sum += i;
        }
        return sum / value.length;
        //return (double)sum(value)/value.length;
    }
    public static int min(int[] value) {
        int temp=value[0];
        for (int i : value) {
            if (temp > i) {
                temp = i;
            }
        }
        return temp;
    }
    public static int max(int[] value) {
        int temp = value[0];
        for (int i : value) {
            if (temp < i) {
                temp = i;
            }
        }
        return temp;
    }
}
