package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (boolean temp: data) {
            if (temp != data[0]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
