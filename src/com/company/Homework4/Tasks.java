package com.company.Homework4;

import java.util.Scanner;

public class Tasks {


    // 1 задание
    private static void numbers(int n) {
        int a = 1;
        while (a <= n) {
            System.out.println(a);
            a++;
        }
    }

    // 2 задание
    private static String drawRectangle(int width, int height) {
        String result = "";
        for (int i = 0; i < height; i++) {
            String line = "";
            for (int j = 0; j < width; j++) {
                line += "+";
            }
            result += line + "\n";
        }
        return result;
    }

    // 3 задание
    private static String drawRectangle2(int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            String line = "";
            for (int j = 0; j < n; j++) {
                line += "+";
            }
            result += line + "\n";
        }
        return result;
    }

    // 4 задание
    private static int getMax(int a, int b) {
        if (a > b) {
            return a;
        } else
            return b;
    }

    private static int getMax(int a, float b) {
        if (a > b) {
            return a;
        } else
            return (int) b;
    }

    // 5 задание
    private static String numbers1(int n) {
        if (n == 1) {
            return "1";
        }
        return numbers1(n - 1) + " " + n;
    }

    // 6 задание
    private static void drawLine(int a) {
        if (a > 0) {
            System.out.print("+");
            drawLine(a - 1);
        }
    }

    private static void drawRectangle2(int width, int height) {
        if (height > 0) {
            drawLine(width);
            System.out.println();
            drawRectangle2(width, height - 1);
        }
    }



    private static void Start() {
        System.out.println("Добро пожаловать!");

        int t;
        do {
            Scanner numb = new Scanner(System.in);
            System.out.println("Какую хотите решить задачу? (1-6)\n" +
                    "1 - функция которая считает в консоли до числа Х\n" +
                    "2 - функция которая рисует в консоли прямоугольник из символов '+'\n" +
                    "3 - функция которая рисует в консоли прямоугольник из символов '+'(одинаковая ширина и высота)\n" +
                    "4 - функция которая возвращает максимальное из двух чисел\n" +
                    "5 - задача 1 с использованием рекурсии\n" +
                    "6 - задача 2 с использованием рекурсии");
            t = numb.nextInt();
            switch (t) {
                case 1:
                    System.out.print("Введите n = ");
                    int n = numb.nextInt();
                    numbers(n);
                    break;
                case 2:
                    System.out.print("Введите ширину = ");
                    int width = numb.nextInt();
                    System.out.print("Введите высоту = ");
                    int height = numb.nextInt();
                    System.out.println(drawRectangle(width, height));
                    break;
                case 3:
                    System.out.print("Введите n = ");
                    n = numb.nextInt();
                    System.out.println(drawRectangle2(n));
                    break;
                case 4:
                    System.out.println("Целый тип чисел? (Да-1/Нет-2)");
                    int type = numb.nextInt();
                    if (type == 1) {
                        System.out.print("Введите a = ");
                        int a = numb.nextInt();
                        System.out.print("Введите b = ");
                        int b = numb.nextInt();
                        System.out.println(getMax(a, b));
                    } else if (type == 2) {
                        System.out.print("Введите a = ");
                        int a = numb.nextInt();
                        System.out.print("Введите b = ");
                        float b = numb.nextFloat();
                        System.out.println(getMax(a, b));
                    }
                    break;
                case 5:
                    System.out.print("Введите n = ");
                    n = numb.nextInt();
                    System.out.println(numbers1(n));
                    break;
                case 6:
                    System.out.print("Введите ширину = ");
                    width = numb.nextInt();
                    System.out.print("Введите высоту = ");
                    height = numb.nextInt();
                    drawRectangle2(width, height);
                    break;
                default:
                    System.out.println("Введите номер задачи от 1 до 6");
                    break;
            }

            System.out.println("Хотите еще одну решить? (Yes-1/No-0)");
            int answer = numb.nextInt();
            if (answer == 0) {
                break;
            }
        }
        while (t != 0);
    }

    public static void main(String[] args) {
        Start();
    }


}
