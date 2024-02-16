package ru.example.chapter001.ru.example.chapter001.paragraph2.example2;

import java.util.Scanner;

public class Example1228 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble(), y = sc.nextDouble(), z = sc.nextDouble();
        System.out.println((x < y && y < z) || (x > y && y > z));
    }
}
