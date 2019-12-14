package ru.progwards.java1.lessons.bigints;

public class ShortInteger extends AbsInteger {
    short aShort;

    public ShortInteger(short aShort) {
        this.aShort = aShort;
    }

    @Override
    public String toString() {
        return "ShortInteger{" +
                "aShort=" + aShort +
                '}';
    }
}
