package ru.example.chapter001.ru.example.chapter001.paragraph4.example4;

public class Example148 {
    public static void main(String[] args) {
        int n = 10;
        int[] a = new int[n];
        a[0] = 1;
        a[1] = 1;
        for (int i = 2; i < n; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
