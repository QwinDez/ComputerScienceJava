package ru.example.chapter001.ru.example.chapter001.paragraph4.example4;

import java.util.Scanner;

public class Example1416 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        boolean[][] a = new boolean[n + 1][n + 1];
        for (int i = 2; i <= n; i++)
            for (int j = 2; j <= n; j++) {
                a[i][j] = true;
            }

        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= n; j++) {
                if (a[i][j]) {
                    if (!isPrime(i)) {
                        a[i][j] = false;
                    } else if (!isPrime(j)) {
                        a[i][j] = false;
                    }
                }
            }
        }

        for (boolean[] booleans : a) {
            for (boolean aBoolean : booleans) {
                System.out.print(aBoolean + " ");
            }
            System.out.println();
        }
    }
    public static boolean isPrime (int n) {
        if (n < 2)
            return false;
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0)
                return false;
        return true;
    }
}
