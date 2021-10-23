package ru.vsu.cs.sviridov_d_v;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.ROOT);

        System.out.println("Введите координаты точки: ");

        double x = readNumber("x= ");
        double y = readNumber("y= ");
        checkNumber(x, y);

    }

    static double readNumber(String text) {
        System.out.print(text);
        Scanner scn = new Scanner(System.in);
        return scn.nextDouble();
    }

    static void checkNumber(double x, double y) {

        if (x > 0 && y > 0) {
            System.out.println("Точка находится в 1 координатной четверти");
        } else if (x < 0 && y > 0) {
            System.out.println("Точка находится во 2 координатной четверти");
        } else if (x < 0 && y < 0) {
            System.out.println("Точка находится в 3 координатной четверти");
        } else if (x > 0 && y < 0) {
            System.out.println("Точка находится в 4 координатной четверти");
        } else if (x == 0 && y == 0) {
            System.out.println("Начало отсчёта");
        }

    }


}









