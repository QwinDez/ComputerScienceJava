package ru.example.chapter001.ru.example.chapter001.paragraph4.example4;

import java.util.Scanner;

public class Example146 {
    public static void main(String[] args) {
        char[][] b = {
                {'*', '*', ' ', ' ', '*'},
                {'*', ' ', '*', '*', ' '},
                {'*', '*', ' ', ' ', ' '},
                {' ', '*', '*', '*', ' '},
                {' ', ' ', '*', ' ', ' '},
                    };
        boolean[][] a = new boolean[b.length][b.length];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                if (b[i][j] == '*') {
                    a[i][j] = true;
                } else if (b[i][j] == ' ') {
                    a[i][j] = false;
                }
            }
        }
        for (boolean[] booleans : a) {
            for (boolean aBoolean : booleans) {
                System.out.print(aBoolean + " ");
            }
            System.out.println();
        }
    }
}
