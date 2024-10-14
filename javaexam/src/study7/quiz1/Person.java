package study7.quiz1;

public class Person {
    private String name;
    private CellPhone cellPhone;

    public Person(String name, String phoneNum) {
        this.name = name;
        this.cellPhone = new CellPhone(phoneNum);
    }

    public String getName() {
        return name;
    }

    public CellPhone getCellPhone() {
        return cellPhone;
    }
}
