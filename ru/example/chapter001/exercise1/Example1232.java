package ru.example.chapter001.ru.example.chapter001.exercise1;

import java.util.Scanner;

public class Example1232 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), g = sc.nextInt(), b = sc.nextInt();
        double w = Math.max(Math.max((double)r / 255, (double) g / 255),(double) b / 255);
        double r1 = (double) r / 255, g1 = (double) g / 255, b1 = (double) b / 255;
        if (r == g && g == b) {
            System.out.println(0 + "" + 0 + 0 + 1);
        } else {
            long c = Math.round(((w - r1) / w) * 100), m = Math.round(((w - g1) / w) * 100), y = Math.round(((w - b1) / w) * 100), k = Math.round((1 - w) * 100);
            System.out.println(c + "%");
            System.out.println(m + "%");
            System.out.println(y + "%");
            System.out.println(k + "%");
        }
    }
}
