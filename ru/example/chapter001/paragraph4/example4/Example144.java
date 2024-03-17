package ru.example.chapter001.ru.example.chapter001.paragraph4.example4;

public class Example144 {
    public static void main(String[] args) {
        String[] str = {"Hello", "Dr", "world", "Mr", "Anderson"};
        for (int i = 0; i < str.length / 2; i++) {
            String s = str[i];
            str[i] = str[str.length - 1 - i];
            str[str.length - 1 - i] = s;
        }
        for (String s : str) {
            System.out.println(s.toString());
        }
    }
}
