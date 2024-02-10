package ru.example.chapter001.ru.example.chapter001.paragraph3;

import java.util.Scanner;

public class Gambler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stake = sc.nextInt(), goal = sc.nextInt(), trials = sc.nextInt(), bets = 0, wins = 0;
        for (int i = 0; i < trials; i++) {
            int cash = stake;
            while (cash > 0 && cash < goal) {
                bets++;
                if (Math.random() < 0.5) {
                    cash++;
                } else {
                    cash--;
                }
            }
            if (cash == goal) {
                wins++;
            }
        }
        System.out.println(100 * wins / trials + "% wins");
        System.out.println("Avg # bets: " + bets / trials);
    }
}
