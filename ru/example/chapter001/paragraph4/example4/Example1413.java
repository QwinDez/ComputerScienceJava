package ru.example.chapter001.ru.example.chapter001.paragraph4.example4;

import java.util.Scanner;

public class Example1413 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int) (Math.random() * n);
            }
        }
        int[][] b = new int[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                b[i][j] = a[i][j];
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
