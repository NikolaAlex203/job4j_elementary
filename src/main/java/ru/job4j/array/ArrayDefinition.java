package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива равен: " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Размер массива равен: " + surnames.length);
        float[] price = new float[40];
        System.out.println("Размер массива равен: " + price.length);
        String[] names = {"Polina", "Kate", "Artem", "Alex"};
        for (String name : names) {
            System.out.println(name);
        }
    }
}
