package array.ex;

import java.util.Scanner;

public class ArrayEx8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("학생수를 입력하세요: ");
        int count= scanner.nextInt();
        int[][] students = new int[count][3];
        for (int i = 0; i < students.length; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");
            System.out.print("국어 점수:");
            students[i][0]= scanner.nextInt();
            System.out.print("영어 점수:");
            students[i][1]= scanner.nextInt();
            System.out.print("수학 점수:");
            students[i][2]= scanner.nextInt();
        }
        for (int i = 0; i < students.length; i++) {
            int sum = 0;
            double avg;
            for (int j = 0; j < 3; j++) {
                sum+=students[i][j];
            }
            avg = (double) sum / 3;
            System.out.println((i+1)+"번 학생의 총점: "+sum+", 평균: "+avg);
        }

    }
}
