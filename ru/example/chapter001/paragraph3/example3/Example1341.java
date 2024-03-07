package ru.example.chapter001.ru.example.chapter001.paragraph3.example3;

import java.util.Random;

public class Example1341 {
    public static void main(String[] args) {
        int totalExperiments = 1000000;
        int countSuccess = 0;

        Random random = new Random();

        for (int i = 0; i < totalExperiments; i++) {
            int countSix = 0;

            for (int j = 0; j < 6; j++) {
                int diceRoll = random.nextInt(6) + 1;

                if (diceRoll == 1) {
                    countSix++;
                }
            }

            if (countSix == 1) {
                countSuccess++;
            }
        }

        double probability = (double) countSuccess / totalExperiments;
        System.out.println("Probability: " + probability);
    }
}
