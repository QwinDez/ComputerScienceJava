package ru.example.chapter001.ru.example.chapter001.paragraph3.example3;

import java.util.Scanner;

public class Example138 {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        for (int i = 1; i <= num; i++) {
            if (i % 100 >= 11 && i % 100 <= 20) {
                System.out.println(i + "th " + "Hello");
            } else if (i % 10 == 1) {
                System.out.println(i + "st " + "Hello");
            } else if (i % 10 == 2) {
                System.out.println(i + "nd " + "Hello");
            } else if (i % 10 == 3) {
                System.out.println(i + "rd " + "Hello");
            } else {
                System.out.println(i + "th " + "Hello");
            }
        }
    }
}
