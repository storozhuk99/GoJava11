package com.company.module3;

import java.util.Scanner;

public class function {
    private static int sumNumber(int number) {
        int sum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            sum += lastDigit;
            number /= 10;
        }
        return sum;
    }

    private static int calcMinNumberSumCount(int m, int n) {
        int minSum, count;
        minSum = sumNumber(m);
        count = 1;
        for (int i = m + 1; i <= n; i++) {
            int currentNumberSum = sumNumber(i);
            if (currentNumberSum == minSum) {
                count++;
            }
            if (currentNumberSum < minSum) {
                minSum = currentNumberSum;
                count = 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int result = calcMinNumberSumCount(m, n);
        System.out.println(result);
    }
}
