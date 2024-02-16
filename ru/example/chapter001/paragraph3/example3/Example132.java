package ru.example.chapter001.ru.example.chapter001.paragraph3.example3;

import java.util.Scanner;

public class Example132 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        double discriminant = b * b - 4.0 * a * c;
        discriminant = Math.sqrt(discriminant);
        if ((discriminant > 0) && (a > 0)) {
            System.out.println((-b + discriminant) / 2 * a);
            System.out.println((-b - discriminant) / 2 * a);
        } else if (discriminant == 0) {
            System.out.println(-(b / 2 * a));
        } else {
            System.out.println("Корней нет");
        }
    }
}
