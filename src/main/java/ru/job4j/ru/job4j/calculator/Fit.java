package ru.job4j.ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double rsl = height - 100 * 1.15F;
        return rsl;
    }

    public static double womanWeight(short height2) {
        double rsl =  height2 - 110 * 1.15F;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 204;
        double man = Fit.manWeight(height);
        System.out.println("Man 204 is " + man);
        short height2 = 172;
        double woman = Fit.womanWeight(height2);
        System.out.println("Woman 172 is " + woman);
    }
}