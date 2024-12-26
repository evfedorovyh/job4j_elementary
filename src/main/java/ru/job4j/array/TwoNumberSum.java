package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = array.length - 1;
        int[] result = new int[] {};
        int sum;
        while (i != j) {
            sum = array[i] + array[j];
            if (sum > target) {
                j--;
            } else if (sum < target) {
                i++;
            } else if (sum == target) {
                result = new int[] {i, j};
                break;
            }
        }
        return result;
    }
}
