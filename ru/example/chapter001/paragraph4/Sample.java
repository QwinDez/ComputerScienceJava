package ru.example.chapter001.ru.example.chapter001.paragraph4;

import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        int[] perm = new int[n];
        for (int j = 0; j < n; j++) {
            perm[j] = j;
        }

        for (int i = 0; i < m; i++) {
            int r = i + (int) (Math.random() * (n - i));
            int t = perm[r];
            perm[r] = perm[i];
            perm[i] = t;
        }

        for (int i = 0; i < m; i++) {
            System.out.print(perm[i] + " ");
        }
        System.out.println();
    }
}
