package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] form = new int[5];
        for (int i = 0; i < form.length; i++) {
            form[i] = i * 2 + 3;
        }

        for (int forms : form) {
            System.out.println(forms);
        }
    }
}
