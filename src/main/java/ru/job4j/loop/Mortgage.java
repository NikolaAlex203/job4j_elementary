package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        while (amount > 0) {
            amount = (amount + amount * (percent / 100));
            amount -= salary;
            year++;
        }
        return year;
    }

    public static void main(String[] args) {
        int time = Mortgage.year(2000, 1000, 12);
        System.out.println("Ипотека будет погашена через " + time + " год/года/лет");
    }
}
