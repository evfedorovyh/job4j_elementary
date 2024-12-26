package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int end = array.length - 1;
        int j = end;
        int[] result = new int[] {};
        while (i != j) {
            if ((array[i] + array[j]) == target) {
                result = new int[] {i, j};
                return result;
            }
            j--;
            if (i == j && i < end - 1) {
                i++;
                j = end;
            }
        }
        return result;
    }
}
