package ru.example.chapter001;

public class TruthTable {
    public static void main(String[] args) {
        boolean[] a = new boolean[] {false, true, false, true};
        boolean[] b = new boolean[] {true, false};
        for (boolean parent : a) {
            for (boolean child : b) {
                boolean rsl = (!(parent && child));
                System.out.println("Parent : " + parent + ", Child : " + child  + " Result = " + rsl);
                rsl = !(parent || child);
                System.out.println("Parent : " + parent + ", Child : " + child  + " Result = " + rsl);
            }
            System.out.println();
        }
    }
}
