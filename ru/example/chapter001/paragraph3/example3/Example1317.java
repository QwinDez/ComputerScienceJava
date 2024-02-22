package ru.example.chapter001.ru.example.chapter001.paragraph3.example3;

import java.util.Scanner;

public class Example1317 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(), p = sc.nextInt(), r = sc.nextInt(), i = 1, m;
        m = t * 12;
        while (i <= m) {
            System.out.println(p * Math.pow(Math.E, r * i));
            i++;
        }
    }
}
