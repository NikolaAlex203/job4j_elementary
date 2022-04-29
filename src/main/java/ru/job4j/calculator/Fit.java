package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl =  (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short manHeight = 204;
        double manWeight = Fit.manWeight(manHeight);
        System.out.println("Man 204 is " + manWeight);
        short womanHeight = 172;
        double womanWeight = Fit.womanWeight(womanHeight);
        System.out.println("Woman 172 is " + womanWeight);
    }
}
