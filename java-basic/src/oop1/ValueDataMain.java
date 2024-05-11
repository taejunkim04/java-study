package oop1;

public class ValueDataMain {

    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        valueUp(valueData);
        valueUp(valueData);
        valueUp(valueData);
        System.out.println("최종 숫자=" + valueData.value);
    }

    static void valueUp(ValueData data) {
        data.value++;
        System.out.println("숫자 증가 value="+data.value);
    }
}
