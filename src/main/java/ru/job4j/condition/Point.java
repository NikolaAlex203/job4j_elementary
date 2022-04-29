package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        int deltaX = x2 - x1;
        int deltaY = y2 - y1;
        double powX = Math.pow(deltaX, 2);
        double powY = Math.pow(deltaY, 2);
        double powXPlusPowY = powX + powY;
        double rsl = Math.sqrt(powXPlusPowY);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}