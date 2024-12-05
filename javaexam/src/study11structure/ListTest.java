package study11structure;

import java.util.*;

public class ListTest {
    public static void main(String[] args) {
        // 다양한 방법으로 리스트 생성
        List<String> l1 = new ArrayList<>();
        List<String> l2 = Arrays.asList("one", "two");
        List<String> l3 = List.of("three", "four");

        // 리스트에 데이터 추가
        l1.addAll(l2);
        l1.addAll(1, l3);
        l1.add("five");

        System.out.println("## l1 리스트의 요소");
        System.out.println(l1);

        // LinkedList 생성 및 데이터 추가
        LinkedList<String> llist = new LinkedList<>();
        llist.addAll(l2);
        llist.addAll(1, l3);
        llist.add("five");

        System.out.println("## llist LinkedList 요소");
        System.out.println(llist);

        // 데이터 참조
        System.out.println("## l1 첫번째 데이터: " + l1.get(0));
        System.out.println("## l1 'three' 데이터의 인덱스: " + l1.lastIndexOf("three"));

        // 데이터 변경
        System.out.println("## l1, 0번 인덱스 값을 변경: element in List");
        l1.set(0, "zero");
        System.out.println(l1);

        // 내림 차순 정렬
        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(3);
        values.add(4);
        values.add(2);
        values.add(5);
        Collections.sort(values);
        System.out.println("## l1 내림 차순 정렬");
        System.out.println(values);

        // 올림 차순 정렬
        l1.sort(new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return o2.toString().compareTo(o1.toString());
            }
        });
        System.out.println("## l1 올림 차순 정렬");
        System.out.println(l1);

        // Ascending sort with stream api
        //System.out.println("## l1 올림 차순 정렬-stream api 사용");
        //System.out.println(l1.stream().sorted((o1, o2) -> o2.toString().compareTo(o1.toString())).toList());
    }
}
