package study11structure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ColleTest {
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<>();
        values.add(12);
        values.add(5);
        values.add(2);
        values.add(23);
        values.add(22);
        values.add(7);
        values.add(16);
        values.add(82);
        Collections.sort(values, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(values);

    }
}
