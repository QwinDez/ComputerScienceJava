package ru.example.chapter001.ru.example.chapter001.paragraph3.example3;

import java.util.Scanner;

public class Median {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt(), e = sc.nextInt(), median = 0;

        for (int i = 0; i < 7; i++) {
            if ((a >= b && a <= c) || (a <= b && a >= c)) {
                median = a;
            } else if ((b >= a && b <= c) || (b <= a && b >= c)) {
                median = b;
            } else {
                median = c;
            }
        }

        System.out.println("Медиана: " + median);
    }
}
