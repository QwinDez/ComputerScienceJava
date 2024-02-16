package ru.example.chapter001.ru.example.chapter001.paragraph2.example2;

import java.util.Scanner;

public class Example1219 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println((int) (Math.random() * b) + a);
    }
}
