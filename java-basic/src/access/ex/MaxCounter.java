package access.ex;

public class MaxCounter {
    private int count = 0;
    private int max;

    MaxCounter(int max) {
        this.max = max;
    }
    public void increment() {
        if (count < max) {
            count++;
        } else {
            System.out.println("최대값을 초과하였습니다.");
        }
    }

    public int getCount() {
        return count;
    }


}