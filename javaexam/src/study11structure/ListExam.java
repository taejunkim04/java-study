package study11structure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListExam {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>();
        List<String> l2 = Arrays.asList("one","two");
        List<String> l3 = List.of("three", "four");

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
    }
}
