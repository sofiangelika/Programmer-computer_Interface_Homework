package com.company;

import java.util.GregorianCalendar;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        homework_4();
        homework_5();
        homework_6();
    }

    public static void homework_4() {
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println("current time: " + cal.getTime());
    }

    public static void homework_5() {
        try {
            Scanner reader = new Scanner(new File("ints.txt"));
            int sum = 0;
            while (reader.hasNextInt()) {
                sum += reader.nextInt();
            }
            System.out.println(sum);
        } catch (Exception e) {
            System.out.println("got exception: " + e);
        }
    }

    public static void homework_6() {
        try {
            Scanner reader = new Scanner(new File("resource_a.txt"));
            FileWriter writer = new FileWriter("resource_b.txt");
            while (reader.hasNext()) {
                int length = reader.next().length();
                writer.write(length + "\n");
            }
            writer.close();
            System.out.println("done");

        } catch (Exception e) {
            System.out.println("got exception: " + e);
        }
    }
}
