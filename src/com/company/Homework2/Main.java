package com.company.Homework2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String name, city, hobby;
        int year;

        Scanner sn, sc, sy, sh;

        System.out.println("Введите имя:");
        sc = new Scanner(System.in);
        name = sc.nextLine();

        System.out.println("Введите город проживания:");
        sc = new Scanner(System.in);
        city = sc.nextLine();

        System.out.println("Введите возраст:");
        sc = new Scanner(System.in);
        year = sc.nextInt();

        System.out.println("Введите хобби:");
        sc = new Scanner(System.in);
        hobby = sc.nextLine();

        System.out.println("-----------------------------------------");
        System.out.println( "Имя:     " + name +
                            "\nГород:   " + city +
                            "\nВозраст: " + year +
                            "\nХобби:   " + hobby);

        System.out.println("-----------------------------------------");
        System.out.println("Человек по имени " + name +
                " живет в городе " + city +
                ".\nЭтому человеку " + year +
                " лет и любит он заниматься " + hobby + ".");

        System.out.println("//-----------------------------------------");
        System.out.println( name + " - имя\n" +
                            city + " - город\n" +
                            year + " - возраст\n" +
                            hobby + " - хобби");
    }
}
