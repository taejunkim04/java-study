package study9;

public class PetExam {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.bark();
        cat.bark();
        RobotDog rd = new RobotDog();
        rd.setName("robo dog");
        rd.bark();
        rd.move();
        rd.charging();
    }
}
