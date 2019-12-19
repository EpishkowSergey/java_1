package ru.progwards.java1.lessons.bigints;

public class ShortInteger extends AbsInteger {
    short aShort;

    public ShortInteger(short aShort) {
        this.aShort = aShort;
    }

    @Override
    public String toString() {
        return String.valueOf(aShort);
    }

    @Override
    public int getValue() {
        return aShort;
    }
}
