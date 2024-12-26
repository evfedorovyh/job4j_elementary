package ru.job4j.array;
import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int dif = money - price;
        int size = 0;
        int i = 0;
        while (dif != 0) {
            if (dif >= coins[i]) {
                dif -= coins[i];
                result[size] = coins[i];
                size++;
            } else {
                i++;
            }
        }
        return Arrays.copyOf(result, size);
    }
}
