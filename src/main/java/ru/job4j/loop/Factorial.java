package ru.job4j.loop;

public class Factorial {
    public static int calculate(int number) {
        int calculate = 1;
        for (int i = 1; i <= number; i++) {
            calculate *= i;
        }
        return calculate;
    }
}
