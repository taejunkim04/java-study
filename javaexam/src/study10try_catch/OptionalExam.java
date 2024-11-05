package study10try_catch;

import java.util.Optional;

public class OptionalExam {
    public void test1(Optional<String> name) {
        System.out.print("optionalTest1(): ");
        System.out.println(name.orElse("이름 없음").toUpperCase());
    }

    //null이 없다는 가정하에 실행,메인에서 보완 가능
    public void test2(String name) {
        System.out.print("optionalTest2(): ");
        System.out.println(name.toUpperCase());
    }

    public static void main(String[] args) {
        OptionalExam optionalExam = new OptionalExam();

        //Optional<String> name = Optional.ofNullable("kim gil hong");
        Optional<String> name = Optional.ofNullable(null);
        optionalExam.test1(name);
        optionalExam.test2(name.orElse("--"));//null유입 없도록
    }
}
