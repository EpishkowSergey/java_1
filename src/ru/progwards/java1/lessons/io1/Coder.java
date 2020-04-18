package ru.progwards.java1.lessons.io1;

import java.io.FileNotFoundException;
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
                FileWriter writer = new FileWriter(outFileName, true);
                try {
                    while (scanner.hasNext()) {
                        String symbol = scanner.next();
                        writer.write(code[Integer.parseInt(symbol)]);
                    }
                }
                finally {
                    writer.close();
                }
            }
            finally {
                reader.close();
            }
        } catch (IOException e) {
            try {
                FileWriter writer = new FileWriter(logName);
                try {
                    writer.write(e.getMessage());
                } finally {
                    writer.close();
                }
            } catch (IOException ex) {
            }

        }
    }
}