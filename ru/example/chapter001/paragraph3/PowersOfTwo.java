package ru.example.chapter001.ru.example.chapter001.paragraph3;

import java.util.Scanner;

public class PowersOfTwo {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt(), power = 1, i = 0;
        while (i <= n) {
            System.out.println(i + " " + power);
            power *= 2;
            i += 1;
        }
    }
}
