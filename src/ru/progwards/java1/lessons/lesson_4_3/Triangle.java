package ru.progwards.java1.lessons.lesson_4_3;

public class Triangle extends Segment{
    double b;
    double c;

    Triangle(double a, double b, double c) {
        super(a);
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Треугольник со сторонами " + a + ", " + b + ", " + c;
    }

    @Override
    double area() {
        double hP = perimeter() / 2;
        return Math.sqrt(hP * (hP - a) * (hP - b) * (hP - c));
    }

    @Override
    double perimeter() {
        return a + b + c;
    }
}
