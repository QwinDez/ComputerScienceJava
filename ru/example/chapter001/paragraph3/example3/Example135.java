package ru.example.chapter001.ru.example.chapter001.paragraph3.example3;

public class Example135 {
    public static void main(String[] args) {
        double r = Math.random();
        int x;
        if (r < 1.0 / 8.0) {
            x = 1;
        } else if (r < 2.0 / 8.0) {
            x = 2;
        } else if (r < 3.0 / 8.0) {
            x = 3;
        } else if (r < 4.0 / 8.0) {
            x = 4;
        } else if (r < 5.0 / 8.0) {
            x = 5;
        } else {
            x = 6;
        }
        System.out.println(x);
    }
}
