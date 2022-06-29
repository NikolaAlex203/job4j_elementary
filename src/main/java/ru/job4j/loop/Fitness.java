package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        while (ivan <= nik) {
            ivan *= 3;
            nik *= 2;
            month++;
        }
        return month;
    }

    public static void main(String[] args) {
        int m = Fitness.calc(82, 90);
        System.out.println("Иван обгонит Николая через " + m + " месяц/месяца/месяцев");
    }
}

