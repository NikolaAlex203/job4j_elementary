package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        return left[right.length - 1] == right[left.length - 1];
    }
}
