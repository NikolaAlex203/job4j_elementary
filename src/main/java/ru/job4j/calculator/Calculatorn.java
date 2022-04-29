package ru.job4j.calculator;

public class Calculatorn {
    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Calculatorn.plus(1, 2);
        Calculatorn.plus(10, 11);
        Calculatorn.plus(100, 500);
        Calculatorn.plus(4, 2);
        Calculatorn.plus(3, 5);
    }
}
