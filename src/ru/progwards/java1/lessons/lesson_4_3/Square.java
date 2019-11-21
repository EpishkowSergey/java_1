package ru.progwards.java1.lessons.lesson_4_3;

public class Square extends Segment{
    Square(double a) {
        super(a);
    }

    @Override
    public String toString() {
        return "Квадрат " + a + " X " + a;
    }

    @Override
    double area() {
        return a * a;
    }

    @Override
    double perimeter() {
        return 4 * a;
    }

}
