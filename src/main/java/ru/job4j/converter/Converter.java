package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = Math.round(value / 77);
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = Math.round(value / 72);
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(300);
        System.out.println("300 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(500);
        System.out.println("500 rubles are " + dollar + " dollar");
        float inE = 300;
        float expectedE = 4;
        float outE = Converter.rubleToEuro(inE);
        boolean passedE = expectedE == outE;
        System.out.println("300 rubles are 4. Test result : " + passedE);
        float inD = 500;
        float expectedD = 7;
        float outD = Converter.rubleToDollar(inD);
        boolean passedD = expectedD == outD;
        System.out.println("500 rubles are 7. Test result : " + passedD);
    }
}
