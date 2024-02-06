package ru.example.chapter001.ru.example.chapter001.exercise1;

import java.util.Scanner;

public class Example1233 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble(), y1 = sc.nextDouble(), x2 = sc.nextDouble(), y2 = sc.nextDouble();
        double d = 60 * Math.toRadians(Math.acos((Math.sin(x1) * Math.sin(x2)) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)));
        System.out.println(Math.toDegrees(d));
    }
}
