package ru.progwards.java1.lessons.lesson_4_3;

public class ConstructorTest {
    public static void main(String[] args) {
        class Parent {
            Parent() {
                System.out.printf("Вызван конструктор Parent");
            }
        }

        class Child {
            Child() {
                System.out.println("Вызван конструктор Child");
            }
        }

        new Child();
    }
}
