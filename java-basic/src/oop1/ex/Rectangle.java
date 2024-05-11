package oop1.ex;

public class Rectangle {

    int width = 0;
    int height = 0;
    int area = 0;
    int perimeter = 0;
    boolean square = false;

    void calculateArea() {
        System.out.println("넓이: " + width * height);
        area = width * height;
    }

    void calculatePerimeter() {
        System.out.println("둘레 길이: "+(width * 2 + height * 2));
        perimeter= width * 2 + height * 2;
    }

    void isSquare() {
        if (width == height) {
            square = true;
            System.out.println("정사각형 여부: " + square);
        } else {
            square = false;
            System.out.println("정사각형 여부: " + square);
        }
    }
}
