package ru.example.chapter001.ru.example.chapter001.paragraph3.example3;

import java.util.Scanner;

public class Example1345 {
    public static void main(String[] args) {
        double x = new Scanner(System.in).nextDouble();
        double r = 1.0 - x;
        int t = 10;
        for (int i = 0; i < t; i++) {
            x = 1.0 - 1.0 / r;
            x += t;
            System.out.println(x + "");
        }
    }
}
