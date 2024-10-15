package study7.quiz1;

public class Person {
    private String name;
    private CellPhone cellPhone;

    public Person() {

    }
    public Person(String name, CellPhone phoneNum) {
        this.name = name;
        this.cellPhone = phoneNum;
    }

    public String getName() {
        return name;
    }

    public CellPhone getCellPhone() {
        return cellPhone;
    }
}
