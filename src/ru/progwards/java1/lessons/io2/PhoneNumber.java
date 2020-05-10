package ru.progwards.java1.lessons.io2;

public class PhoneNumber {
    public static String format(String phone) throws Exception {
        String str = "";
        for (char c : phone.toCharArray()) {
            if (Character.isDigit(c)) {
                str = str + c;
            }
        }

        if (str.toCharArray().length > 11 || str.toCharArray().length < 10) {
            throw new Exception();
        }

        if (str.toCharArray().length == 11) {
            str = str.substring(1);
        }

        str = "+7(" + str.substring(0, 3) + ")" + str.substring(3, 6) + "-" + str.substring(6);

        return str;
    }

    public static void main(String[] args) {
        String phone = "8 (999) 111-22-33";

        String phone2 = "111-22-33";

        try {
            System.out.println(format(phone));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            System.out.println(format(phone2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
