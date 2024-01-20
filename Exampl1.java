package ru.example.chapter001;

public class Exampl1 {
    public static void main(String[] args) {
        double a = 12.2;
        double b = 5.0;
        double c = Math.pow(Math.cos(a), 2) + Math.pow(Math.sin(b), 2);
        System.out.println(c);
        System.out.println(c >= 1);
    }
}
