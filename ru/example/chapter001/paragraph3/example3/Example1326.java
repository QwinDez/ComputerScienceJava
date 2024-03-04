package ru.example.chapter001.ru.example.chapter001.paragraph3.example3;

import java.util.Scanner;

public class Example1326 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
            stake - исходная сумма
            goal - целевая сумма
            trials - кол-во опытов
            bets - кол-во ставок
            wins - кол-во побед
            cash - текущая сумма
         */
        int stake = sc.nextInt(), goal = sc.nextInt(), trials = sc.nextInt(), bets = sc.nextInt(), wins = 0;
        for (int i = 0; i < trials; i++) {
            int cash = stake;
            while (cash > 0 && cash < goal) {
                if (Math.random() < 0.5) {
                    cash++;
                } else {
                    cash--;
                }
                bets--;
            }
            if (cash == goal) {
                wins++;
                System.out.println("Игрок выигрывает");
            } else if (cash < goal) {
                System.out.println("Игрок проигрывает");
            } else if (bets == 0){
                System.out.println("Время истекло");
            }
            System.out.println("Сумма на руках у игрока: " + cash);
        }
        System.out.println(100 * wins / trials + "% wins");
        System.out.println("Avg # bets: " + bets / trials);
    }
}
