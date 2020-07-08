package ru.progwards.java1.lessons.io2;

import org.checkerframework.checker.units.qual.A;

import java.util.Arrays;

public class Translator {
    private String[] inLang;
    private String[] outLang;

    Translator(String[] inLang, String[] outLang) {
        this.inLang = inLang;
        this.outLang = outLang;
    }

    public String translate(String sentence) {
        String[] arrSentence = sentence.split(" ");
        String out = "";

        for (int i = 0; i < arrSentence.length; i++) {
            String str = "";
            for (char c :
                    arrSentence[i].toCharArray()) {
                if (Character.isAlphabetic(c)) {
                    str = str + c;
                }
            }
            str = str.toLowerCase();
            if (str.equals("")) {
                out = out + arrSentence[i] + " ";
            }
            else {
                for (int j = 0; j < inLang.length; j++) {
                    if (str.equals(inLang[j])) {
                        String in = "";

                        if (arrSentence[i].substring(0, 1).equals(arrSentence[i].substring(0, 1).toUpperCase())) {
                            in = outLang[j].substring(0, 1).toUpperCase() + outLang[j].substring(1);
                        } else {
                            in = outLang[j];
                        }

                        if (str.length() == arrSentence[i].length()) {
                            out = out + in + " ";
                        } else {
                            int substr = arrSentence[i].length() - (arrSentence[i].length() - str.length());
                            out = out + in + arrSentence[i].substring(substr) + " ";
                        }
                    }
                }
            }
        }

        out = out.trim();

        return out;
    }

    public static void main(String[] args) {
        String[] inLang = {"make", "love", "not", "war"};
        String[] outLang = {"твори", "любовь", "не", "войну"};
        String sentence =  "Not war - love make!";
        Translator translator = new Translator(inLang, outLang);
        System.out.println(translator.translate(sentence));
    }
}
