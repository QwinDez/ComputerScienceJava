package ru.example.chapter001.ru.example.chapter001.paragraph3.example3;

import java.util.Scanner;

public class Example131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if ((a == b) && (b == c)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}
