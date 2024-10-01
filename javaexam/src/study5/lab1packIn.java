package study5;
public class lab1packIn {
    public static void main(String[] args) {
        int stuCount = 3;//학생의 수
        int subjectCount = 3;//과목의 수

        //데이터 입력
        String[] students = {"홍길동","김사랑","나대장"};
        int[][] scores = {{90, 85, 91}, {92, 95, 88}, {87, 94, 96}};

        //항목명 출력
        System.out.println("학생명 자바 파이썬 c++ 합계 평균");

        //배열을 순회하며 결과 값에 맞게 출력
        for (int i = 0; i < stuCount; i++) {
            System.out.printf("%s\t", students[i]);//학생명 출력
            int sum = 0;
            //학생별 과목들의 점수를 출력하고, 그 과정에서 총합을 미리 계산
            for (int j = 0; j < subjectCount; j++) {
                int temp = scores[i][j];
                sum += temp;
                System.out.printf("%d\t", temp);
            }
            //합계 및 평균 출력 후 줄바꿈하여 다음학생을 출력토록 한다.
            System.out.printf("%d\t %d\n", sum, sum / subjectCount);
        }
    }
}
