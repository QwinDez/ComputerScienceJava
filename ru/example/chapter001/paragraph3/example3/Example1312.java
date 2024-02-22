package ru.example.chapter001.ru.example.chapter001.paragraph3.example3;

public class Example1312 {
    public static void main(String[] args) {
        int n = 16, i = 2;
        while (n <= 2048) {
            System.out.println(Math.log(n) + "\t" + n + "\t" + n * Math.log(n) + "\t" + Math.pow(n, 2) + "\t" + Math.pow(n, 3) + "\t" + Math.pow(2, n));
            n *= i;
        }
    }
}
