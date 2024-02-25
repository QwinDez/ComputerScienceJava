package ru.example.chapter001.ru.example.chapter001.paragraph3.example3;

import java.util.Scanner;

public class Example1321 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(), power;
        long i = sc.nextLong();
        if (k == 2) {
            while (i > 0) {
                power = (int) (i % 2);
                System.out.print("" + power);
                i /= 2;
            }
        } else if (k == 8) {

        } else if (k == 10) {

        } else if (k == 16) {

        }
    }
}
