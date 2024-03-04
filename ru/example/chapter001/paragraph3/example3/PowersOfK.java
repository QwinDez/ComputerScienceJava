package ru.example.chapter001.ru.example.chapter001.paragraph3.example3;

import java.util.Scanner;

public class PowersOfK {
    public static void main(String[] args) {
        int k = new Scanner(System.in).nextInt(), i = 0;
        long n = Long.MAX_VALUE;
        while (Math.pow(k, i) <= n) {
            System.out.println(i);
            i++;
        }
    }
}
