package ru.example.chapter001.ru.example.chapter001.paragraph4.example4;

import java.util.Scanner;

public class Example1413 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int) (Math.random() * n);
            }
        }

        for (int i = 0; i < a.length; i++) {
            int[][] b = new int[a.length][a[i].length];
            for (int j = 0; j < a[i].length; j++) {
                b[i][j] = a[i][j];
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
