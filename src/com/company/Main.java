package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random a = new Random();
        int ranAge = a.nextInt(107);
        System.out.println("Случайное число " + ranAge);

        Random t = new Random();
        int ranT memp = t.nextInt(30) -20;
        System.out.println("Случайное число " + ranTemp);

        String name = "Адилет";
        int age = ranAge;
        int temp = ranTemp;

        if (age > 20 && age < 45) {

            if (temp > 30 || temp < -20) {
                System.out.println("Нельзя выходить");
            } else {
                System.out.println("Можно");
            }
        } else if (age < 20) {

            if (temp > 28 || temp < 0) {
                System.out.println("Нельзя выходить");
            } else {
                System.out.println("Можно");
            }
        } else if (age > 45) {

            if (temp > 25 || temp < -10) {
                System.out.println("Нельзя выходить");
            } else {
                System.out.println("Можно");
            }
        }

    }
}
