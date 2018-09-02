package com.company.Homework3;

import java.util.Scanner;

public class Task1 {
    private static void sorting(int n, int[] array) {
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }

    private static void minMax(int n, int[] array) {
        int min, max;
        min = array[0];
        max = array[0];
        for (int i = 1; i < n - 1; i++) {
            if (min > array[i])
                min = array[i];

            if (max < array[i])
                max = array[i];
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }

 /*   private static void countRepeatOfNumber(int n, int[] array) {
        int count = 1;
        for (int i = 0; i < n - 1; i++) {
            int j = 1;
            while (j < n) {
                if (array[i] == array[j]){
                    count++;}
                    j++;
            }
        }
        System.out.println("Repeat = " + count);
    }
*/
    public static void main(String[] args) {
        System.out.print("Введите размер массива n = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введите " + (i + 1) + " элемент массива = ");
            array[i] = sc.nextInt();
        }

        minMax(n, array);
        sorting(n, array);

        int k = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] == 5)
                k++;
        }
        System.out.println("Количество 5 в массиве = " + k);

     //   countRepeatOfNumber(n, array);
    }

  /*  private static int[] splitNumberToDigits(int n) {
        String string = Integer.toString(n);
        int length = string.length();

        int[] result = new int[length];
        int [] array = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = to (array[i]);
        }
        return result;
    }
*/
}
