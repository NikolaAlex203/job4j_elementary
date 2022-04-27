package ru.job4j.ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 77;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 72;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(300);
        System.out.println("300 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(500);
        System.out.println("500 rubles are " + dollar + " dollar");
    }
}
