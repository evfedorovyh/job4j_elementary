package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean check = false;
        if (number > 1) {
            check = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
        }
        return check;
    }
}