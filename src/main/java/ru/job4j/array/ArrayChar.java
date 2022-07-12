package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        int temp = word.length > pref.length ? pref.length : word.length;
        for (int i = 0; i < temp; i++) {
            if (word[i] != pref[i]) {
                return false;
            }
        }
        return true;
    }
}
