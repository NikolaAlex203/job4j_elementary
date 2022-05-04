package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double minusAndDiv(double first, double second) {
        return minus(first, second)
                + div(first, second);
    }

    public static double general(double first, double second) {
        return  sum(first, second)
                + multiply(first, second)
                    +minus(first, second)
                        +div(first, second);
    }

    public static void main(String[] args) {
        System.out.println("The calculation result is : " + sumAndMultiply(10, 20));
        System.out.println("The calculation result is : " + minusAndDiv(100, 20));
        System.out.println("The calculation result is : " + general(200, 5));
    }
}
