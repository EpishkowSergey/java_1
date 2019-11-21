package ru.progwards.java1.lessons.lesson_4_3;

public class Segment extends Figure {
    double a;

    public Segment(double a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Отрезок, длина " + a;
    }

    @Override
    double perimeter() {
        return a;
    }
}
