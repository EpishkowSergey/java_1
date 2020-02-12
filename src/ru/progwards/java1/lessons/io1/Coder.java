package ru.progwards.java1.lessons.io1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Coder {
    public static void codeFile(String inFileName, String outFileName, char[] code, String logName) {
        try {
            FileReader reader = new FileReader(inFileName);
            try {
                Scanner scanner = new Scanner(reader);
                while (scanner.hasNextLine()) {
                    String strFromFile = scanner.nextLine();
                    char[] symbol = strFromFile.toCharArray();
                    char[] newSymbol = new char[symbol.length];
                    for (int i = 0; i < symbol.length; i++) {
                        newSymbol[i] = code[(int)(symbol[i])];
                    }
                    String strToFile = String.valueOf(newSymbol);
                    FileWriter fileWriter = new FileWriter(outFileName);
                    fileWriter.write(strToFile);
                    fileWriter.close();
                    }
                }
            finally {
                reader.close();
            }
        }
        catch (Exception e) {
            try {
                FileWriter fileWriter = new FileWriter(logName);
                try {
                    fileWriter.write(e.getMessage());
                }
                finally {
                    fileWriter.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
