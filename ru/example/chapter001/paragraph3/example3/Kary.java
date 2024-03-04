package ru.example.chapter001.ru.example.chapter001.paragraph3.example3;

import java.util.Scanner;

public class Kary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        long i = sc.nextLong();
        System.out.println(reverse(loop(k, i)));
    }

    private static String reverse(String str) {
        StringBuilder result = new StringBuilder();
        char[] ch = str.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            result.append(ch[i]);
        }
        return result.toString();
    }

    private static String loop(int k, long i) {
        StringBuilder str = new StringBuilder();
        switch (k) {
            case 2, 8, 10:
                while (i > 0) {
                    str.append(i % k);
                    i /= k;
                }
                break;
            case 16:
                while (i > 0) {
                    if (i % k == 10) {
                        str.append("A");
                    } else if (i % k == 11) {
                        str.append("B");
                    } else if (i % k == 12) {
                        str.append("C");
                    } else if (i % k == 13) {
                        str.append("D");
                    } else if (i % k == 14) {
                        str.append("E");
                    } else if (i % k == 15) {
                        str.append("F");
                    } else {
                        str.append(i % k);
                    }
                    i /= k;
                }
        }
        return str.toString();
    }
}
