package ru.example.chapter001.ru.example.chapter001.paragraph3.example3;

public class Example1333 {
    public static void main(String[] args) {
        double x, y, a, b, c;
        do {
            x = 2.0 * Math.random() - 1.0;
            y = 2.0 * Math.random() - 1.0;
        } while (x * x + y * y > 1.0);
        a = 2 * x * Math.sqrt(1 - Math.pow(x, 2) - Math.pow(y, 2));
        b = 2 * Math.sqrt(1 - Math.pow(x, 2) - Math.pow(y, 2));
        c = 1 - 2 * (Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println(a + " " + b + " " + c);
    }
}
