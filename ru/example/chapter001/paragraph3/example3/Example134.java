package ru.example.chapter001.ru.example.chapter001.paragraph3.example3;

import java.util.Scanner;

public class Example134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble(), y = sc.nextDouble();
        System.out.println(((x >= 0) || (x <= 1)) || ((y >= 0) || (y <= 1)));
    }
}
