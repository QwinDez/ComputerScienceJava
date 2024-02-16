package ru.example.chapter001.ru.example.chapter001.paragraph2.example2;

import java.util.Scanner;

public class Example1224 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(), p = sc.nextInt(), r = sc.nextInt();
        System.out.println(p * Math.pow(Math.E, r*t));
    }
}
