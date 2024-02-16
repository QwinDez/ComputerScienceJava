package ru.example.chapter001.ru.example.chapter001.paragraph2.example2;

import java.util.Scanner;

public class Example1231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double f = sc.nextDouble(), l = sc.nextDouble(), l0 = sc.nextDouble();
        double x = l - l0, y = 0.5 * Math.log((1 + Math.sin(f)) / (1 - Math.sin(f)));
        System.out.println(x + " " + y);
    }
}
