package lesson;

import javax.swing.text.rtf.RTFEditorKit;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Rainbow {
    final public static String RED = "красный";
    final public static String Yellow = "желтый";
    final public static String Green = "зеленый";
    final public static String Blue = "синий";
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число:");
        int number = scanner.nextInt();
        exampleSwitch("синий");
        if (number >= 70){
            System.out.println("красный");
        } else if (number >= 60){
            System.out.println("красно-желтый");
        } else if (number >= 50) {
            System.out.println("желтый");
        } else if (number >= 40) {
            System.out.println("желто-зеленый");
        } else if (number >= 30) {
            System.out.println("зеленый");
        } else if (number >= 20) {
            System.out.println("зелено-синий");
        } else {
            System.out.println("синий");
        }
    }

    public static void exampleIf(String colour) {
        if (colour.equals("красный")) {
            System.out.println(RED);
        } else if (colour.equals("желтый")) {
            System.out.println(Yellow);
        } else if (colour.equals("зеленый")) {
            System.out.println(Green);
        } else if (colour.equals("синий")) {
            System.out.println(Blue);
        } else {
            System.out.println("нет цвета");
        }

    }
    public static void exampleSwitch(String colour) {
        switch (colour){
            case RED : {
                System.out.println(RED);
                break;
            }
            case Yellow : {
                System.out.println(Yellow);
                break;
            }
            case Green : {
                System.out.println(Green);
                break;
            }
            case Blue : {
                System.out.println(Blue);
                break;
            }
            default:
                System.out.println("нет цвета");
        }
    }
}









