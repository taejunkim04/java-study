package poly.basic;

//upcasting vs downcasting
public class CastingMain5 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        call(parent1);
        Parent parent2 = new Child();
        call(parent2);
    }

    private static void call(Parent parent) {
        if (parent instanceof Child) {
            System.out.println("child 인스턴스 맞음");
            Child child = (Child) parent;
            child.childMethod();
        } else {
            System.out.println("child 인스턴스 아님");
        }
    }
}
