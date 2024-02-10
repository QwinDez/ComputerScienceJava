package ru.example.chapter001.ru.example.chapter001.paragraph3;

import java.util.Scanner;

public class DivisorPattern {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i % j == 0) || (j % i == 0)) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(i);
        }
    }
}
