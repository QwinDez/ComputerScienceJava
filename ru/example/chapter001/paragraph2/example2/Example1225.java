package ru.example.chapter001.ru.example.chapter001.paragraph2.example2;

import java.util.Scanner;

public class Example1225 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temperature = sc.nextDouble(), velocity = sc.nextDouble();
        if (Math.abs(temperature) < 50 || (velocity < 120 && velocity > 3)) {
            System.out.println(35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(velocity, 0.16));
        }
    }
}
