package com.company;

public class Main {

    public static void main(String[] args) {

        String name = "Адилет";
        int age = 21;
        int temp = 29;

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
