package ru.example.chapter001.ru.example.chapter001.paragraph2.example2;

import java.util.Scanner;

public class Example1229 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), d = sc.nextInt(), y = sc.nextInt();
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 / m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        System.out.println(m0 + " " + d0 + " " + y0);
    }
}
