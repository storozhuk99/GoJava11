package com.company.module3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int n = new Scanner(System.in).nextInt();

       int [] digits = splitNumberToDigits(n);
       char [][][] toMarge = new char[digits.length][][];

       for (int i = 0; i<digits.length; i++){
           int digit = digits[i];
           char[][] digitMatrix = transform(digit);

       }
    }

    private static char[][] transform(int n) {
        if (n == -1) {
            return new char[][]{
                    {' ', ' ', ' '},
                    {' ', '_', ' '},
                    {' ', ' ', ' '}
            };
        }
        if (n == 1) {
            return new char[][]{
                    {' ', ' ', ' '},
                    {' ', ' ', '|'},
                    {' ', ' ', '|'}
            };
        }
        if (n == 2) {
            return new char[][]{
                    {' ', '_', ' '},
                    {' ', '_', '|'},
                    {'|', '_', ' '}
            };
        }

        return null;
    }

    private static void show(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]);

            }
            System.out.println();
        }

    }

    private static char[][] merge(char[][][] all) {
        int arraysCount = all.length;

        char[][] result = new char[3][3 * arraysCount];
        for (int i = 0; i < all.length; i++) {
            char[][] symbol = all[i];
            int offset = i * 3;
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    result[j][k + offset] = symbol[j][k];
                }
            }
        }
        return result;
    }

    private static int[] splitNumberToDigits(int n) {
        String string = Integer.toString(n);
        int length = string.length();

        int[] result = new int[length];
        char[] array = string.toCharArray();
        for (int i = 0; i < length; i++) {
            result[i] = charToInt(array[i]);
        }
        return result;
    }

    private static int charToInt(char c) {
        switch (c) {
            case '-':
                return -1;
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;
                default: return -2;
        }

    }

}
