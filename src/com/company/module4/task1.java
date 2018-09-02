package com.company.module4;

import java.io.File;

public class task1 {
    public static void main(String[] args) {
        String startDate, endDate;

        startDate = args[0];
        endDate = args[1];

        String[] products = new String[args.length - 2];

        for (int i = 2; i < args.length; i++) {
            products[i - 2] = args[i];

            String startFilename = convertInputDAteTOFilename(startDate);
            String endFilename = convertInputDAteTOFilename(endDate);

        }
    }

    private static String convertInputDAteTOFilename(String date) {
        date = date.replace(".", "-");
        date += ".txt";
        return "./data/" + date;
    }

    private static float parsPrice(String record) {
        float price;
        String[] items = record.split(" ");
        price = Float.parseFloat(items[items.length - 1]);
        return price;
    }

    private static String parsProduct(String record) {
        String product = "";
        String[] items = record.split(" ");
        for (int i = 0; i < items.length - 1; i++) {
            product += items[i] + " ";
        }
        return product.trim();
    }

    private static float sumProductsInFile(String filename, String[] products) {
        File file = new File(filename);
        return 0f;
    }
}
