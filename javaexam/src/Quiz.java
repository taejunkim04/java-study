import java.util.*;
public class Quiz {
    public static void main(String[] args) {
        Map<String, Integer> s1 = new HashMap<>();
        s1.put("국어",80);
        s1.put("영어", 90);
        s1.put("수학", 100);
        Map<String, Integer> s2 = new HashMap<>();
        s2.put("자바",80);
        s2.put("소프트웨어공학",91);
        s2.put("데이터베이스",85);
        s2.put("C++",95);
        Map<String, Integer> s3 = new HashMap<>();
        s3.put("경영학원론", 75);
        s3.put("통계학", 85);

        Map<String, Map<String, Integer>> students = new HashMap<>();
        students.put("홍길동", s1);
        students.put("김철수", s2);
        students.put("이영희", s3);

        Scanner scanner = new Scanner(System.in);
        System.out.print("검색할 이름을 입력하세요: ");
        String name = scanner.next();

        int total = 0;
        //students map의 key값으로 이름에 해당되는 map을 불러와 그에 해당하는 모든 값들을 불러와 합산 및 출력
        for (Map.Entry<String,Integer> entry : students.get(name).entrySet()) {
            System.out.println(entry.getKey()+": "+entry.getValue());
            total += entry.getValue();
        }
        System.out.printf("%s의 총점은 %d 평균은 %d 입니다!!", name, total, total / students.get(name).size());
    }
}
