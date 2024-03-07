package ru.example.chapter001.ru.example.chapter001.paragraph3.example3;

import java.util.Scanner;

public class RandomWalker {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt(), count = 0;
        for (int i = n; i > 0; i--) {
            for (int j = n; j > 0; j--) {
                    count++;
            }
        }
        System.out.println(count);
    }
}
