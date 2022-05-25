package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return (!isEven(num) && notPositive(num));
    }

    public static boolean evenOrNotPositive(int num) {
        return (!notEven(num) && isPositive(num));
    }

    public static void main(String[] args) {
        LogicNot.isEven(4);
        LogicNot.isPositive(5);
        LogicNot.notEven(9);
        LogicNot.notPositive(-4);
        LogicNot.notEvenAndPositive(3);
        LogicNot.evenOrNotPositive(-2);
    }
}