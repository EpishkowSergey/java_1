package ru.progwards.java1.lessons.T_6_2_Test_Block_2;

public class Rectangle {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double area() {

        return a*b;
    }

    public int compareTo(Rectangle anRectangle) {
        int result = 0;
        if (this.area() > anRectangle.area()) {
            result = 1;
        }
        if (this.area() < anRectangle.area()) {
            result = -1;
        }
        return result;
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(2,2);
        Rectangle rectangle2 = new Rectangle(3,3);

        System.out.println(rectangle1.compareTo(rectangle2));
    }
}
