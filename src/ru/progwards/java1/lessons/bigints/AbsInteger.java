package ru.progwards.java1.lessons.bigints;

public class AbsInteger {
    public int getValue() {
        return 0;
    }

    static AbsInteger add(AbsInteger num1, AbsInteger num2) {
        AbsInteger absNum = null;

        if (num1 instanceof ByteInteger & num2 instanceof ByteInteger) {
//            System.out.print("Оба byte: ");
            ByteInteger num = new ByteInteger((byte) (num1.getValue() + num2.getValue()));
//            System.out.println(num.aByte);
            absNum = num;
        }

        if (num1 instanceof IntInteger || num2 instanceof IntInteger) {
//            System.out.print("С типом int: ");
            IntInteger num = new IntInteger(num1.getValue() + num2.getValue());
//            System.out.println(num);
            absNum = num;
        }

        if ((num1 instanceof ByteInteger & num2 instanceof ShortInteger) || (num1 instanceof ShortInteger & num2 instanceof ByteInteger) || (num1 instanceof ShortInteger & num2 instanceof ShortInteger)) {
//            System.out.print("С типом short: ");
            ShortInteger num = new ShortInteger((short) (num1.getValue() + num2.getValue()));
//            System.out.println(num);
            absNum = num;
        }

        return absNum;
    }

    public static void main(String[] args) {
        ByteInteger byteInt1 = new ByteInteger((byte) 25);
        ByteInteger byteInt2 = new ByteInteger((byte) 35);
        ShortInteger shortInt1 = new ShortInteger((short) 20);
        ShortInteger shortInt2 = new ShortInteger((short) 20);
        IntInteger intInt1 = new IntInteger(100);
        IntInteger intInt2 = new IntInteger(150);


        AbsInteger.add(byteInt1, byteInt2);
        AbsInteger.add(byteInt1, shortInt2);
        AbsInteger.add(shortInt1, byteInt2);
        AbsInteger.add(shortInt1, shortInt2);
        AbsInteger.add(byteInt1, intInt2);
        AbsInteger.add(shortInt1, intInt2);
        AbsInteger.add(intInt1, intInt2);
        AbsInteger.add(intInt1,byteInt2);
        AbsInteger.add(intInt1, shortInt2);
    }
}
