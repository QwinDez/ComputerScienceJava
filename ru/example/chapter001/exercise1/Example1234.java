package ru.example.chapter001.ru.example.chapter001.exercise1;

import java.util.Scanner;

public class Example1234 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int min = Math.min(Math.min(a, b), c), max = Math.max(Math.max(a, b), c);
        int avg = (a + b + c) - min - max;
        System.out.println(min + " " + avg + " " + max);
    }
}
