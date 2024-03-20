package ru.example.chapter001.ru.example.chapter001.paragraph4.example4;

import java.util.Scanner;

public class DiscreteDistribution {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = (int) (Math.random() * n);
        }
    }
}
