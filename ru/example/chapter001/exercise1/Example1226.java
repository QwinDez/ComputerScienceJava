package ru.example.chapter001.ru.example.chapter001.exercise1;

import java.util.Scanner;

public class Example1226 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble(), y = sc.nextDouble();
        System.out.println(Math.atan2(y, x));
    }
}
