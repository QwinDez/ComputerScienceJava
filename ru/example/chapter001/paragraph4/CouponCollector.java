package ru.example.chapter001.ru.example.chapter001.paragraph4;

import java.util.Scanner;

public class CouponCollector {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        boolean[] isCollected = new boolean[n];
        int count = 0, distinct = 0;
        while (distinct < n) {
            int r = (int) (Math.random() * n);
            count++;
            if (!isCollected[r]) {
                distinct++;
                isCollected[r] = true;
            }
        }
        System.out.println(count);
    }
}
