package ru.example.chapter001.ru.example.chapter001.paragraph2.example2;

import java.util.Scanner;

public class Example1223 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt(), m = sc.nextInt();
        System.out.println((m >= 3 && m <= 6) && d <= 20);
    }
}
