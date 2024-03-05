package ru.example.chapter001.ru.example.chapter001.paragraph3.example3;

import java.util.Scanner;

public class Example1334 {
    public static void main(String[] args) {
        int n = new Scanner(System.in). nextInt();
        for (int a = 1; a <= n; a++) {
            int a1 = (int) Math.pow(a, 3);
            if (a1 > n) {
                break;
            }
            for (int b = 0; b < n; b++) {
                int b1 = (int) Math.pow(a, 3);
                if (a1 + b1 > n) {
                    break;
                }
                for (int c = 0; c < n; c++) {
                    int c1 = (int) Math.pow(a, 3);
                    if (c1 > a1 + b1) {
                        break;
                    }
                    for (int d = 0; d < n; d++) {
                        int d1 = (int) Math.pow(a, 3);
                        if (c1 + d1 > a1 + b1) {
                            break;
                        }
                        if (a1 + b1 == c1 + d1) {
                            System.out.print((a1+b1) + " = ");
                            System.out.print(a + "^3 + " + b + "^3 = ");
                            System.out.print(c + "^3 + " + d + "^3");
                            System.out.println();
                        }
                    }
                }
            }
        }
    }
}
