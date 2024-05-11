package construct;

public class MethodInitMain2 {

    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        creatInit(member1,"user1", 15, 90);

        MemberInit member2 = new MemberInit();
        creatInit(member2,"user2", 16, 80);

        MemberInit[] members = {member1, member2};

        for (MemberInit member : members) {
            System.out.println("이름: " + member.name + " 나이:" + member.age + " 성적: " + member.grade);
        }
    }
    static void creatInit(MemberInit init,String name, int age, int grade) {
        init.name = name;
        init.age = age;
        init.grade = grade;
    }


}
