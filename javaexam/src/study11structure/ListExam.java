package study11structure;

import java.util.*;

public class ListExam {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>();
        List<String> l2 = Arrays.asList("one","two");//수정 불가
        List<String> l3 = List.of("three", "four");//수정 불가

        l1.addAll(l2);
        l1.addAll(1, l3);
        l1.add("five");

        System.out.println("## l1 리스트의 요소");
        System.out.println(l1);

        LinkedList<String> llist = new LinkedList<>();
        llist.addAll(l2);
        llist.addAll(1, l3);
        llist.add("five");

        System.out.println("##llist linkedlist 요소");
        System.out.println(llist);

        System.out.println("## l1 첫번째 데이터: " + l1.get(0));
        System.out.println("## l1 'three' 데이터의 인덱스: " + l1.lastIndexOf("three"));

        System.out.println("## l1, 0번 인덱스 값을 변경: element in List");
        l1.set(0, "zero");
        System.out.println(l1);

        Collections.sort(l1);
        System.out.println("## l1 내림차순 정렬");
        System.out.println(l1);
        l1.sort(new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return o2.toString().compareTo(o1.toString());
            }
        });//객체 등을 추후 비교할 수 있기에 기준을 개발자가 재정의
        System.out.println("## l1 올림차순 정렬");
        System.out.println(l1);
        // Ascending sort with stream api
        //System.out.println("## l1 올림 차순 정렬-stream api 사용");
        //System.out.println(l1.stream().sorted((o1, o2) -> o2.toString().compareTo(o1.toString())).toList());
        // 람다 표현식
    }
}
