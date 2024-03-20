package ru.example.chapter001.ru.example.chapter001.paragraph4.example4;

import java.util.Scanner;

public class Deal {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        for (int i = 0; i < n; i++) {
            int a = 5;
            while (a > 0) {
                int g = (int) (Math.random() * SUITS.length);
                int k = (int) (Math.random() * RANKS.length);
                System.out.println(RANKS[k] + " of " + SUITS[g]);
                a--;
            }
            System.out.println();
        }
    }
}
