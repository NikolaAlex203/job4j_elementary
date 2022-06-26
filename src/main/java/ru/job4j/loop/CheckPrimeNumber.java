package ru.job4j.loop;

public class CheckPrimeNumber {

    public static boolean check(int number) {
        boolean prime = number > 1;
        for (int index = 1; index <= number; index++) {
            if ((number % index) == 1) {
                prime = true;
                break;

            } else if (((number % 2) == 0)) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}

