package ru.example.chapter001.ru.example.chapter001.paragraph4.example4;

import java.util.Scanner;

public class Example143 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int[] a = new int[n], b = new int[n], rsl = new int[n];
        double r = 0.0;
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * Math.pow(i, 2));
            b[i] = (int) (Math.random() * Math.pow(i, 2));
            rsl[i] = (int) (Math.pow(a[i] - b[i], 2));
            r += rsl[i];
        }
        System.out.println(Math.sqrt(r));
    }
}
