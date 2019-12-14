package ru.progwards.java1.lessons.bigints;

public class IntInteger extends AbsInteger{
    int anInt;

    public IntInteger(int anInt) {
        this.anInt = anInt;
    }

    @Override
    public String toString() {
        return String.valueOf(anInt);
    }
}
