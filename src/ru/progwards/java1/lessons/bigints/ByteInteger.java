package ru.progwards.java1.lessons.bigints;

import java.util.Objects;

public class ByteInteger extends AbsInteger {
    byte aByte;

    public ByteInteger(byte aByte) {
        this.aByte = aByte;
    }

    @Override
    public String toString() {
        return String.valueOf(aByte);
    }
}
