package ru.example.chapter001.ru.example.chapter001.paragraph3.example3;

import java.util.Scanner;

public class MonteHall {
    public static void main(String[] args) {
        int trials = new Scanner(System.in).nextInt();
        int wins = 0;

        for (int i = 0; i < trials; i++) {

            int prize  = (int) (3 * Math.random());
            int choice = (int) (3 * Math.random());
            int reveal;

            do {
                reveal = (int) (3 * Math.random());
            } while ((reveal == choice) || (reveal == prize));

            int other = (1 + 2) - reveal - choice;
            if (other == prize) wins++;
        }

        System.out.println("Fraction of games won = " + 1.0 * wins / trials);
    }
}
