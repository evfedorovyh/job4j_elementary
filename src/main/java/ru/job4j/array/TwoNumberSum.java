package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = 1;
        int[] result = new int[] {};
        while (i < array.length - 1) {
            if ((array[i] + array[j]) == target) {
                result = new int[] {i, j};
                break;
            }
            j++;
            if (j == array.length) {
                i++;
                j = i + 1;
            }
        }
        return result;
    }
}
