package ru.job4j.loop;

public class NumberPyramid {
    public static void draw(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = n; k > i; k--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            for (int k = 1; k < i; k++) {
                System.out.print(i - k);
            }
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Number pyramid of height 0:");
        draw(0);
        System.out.println("Number pyramid of height 1:");
        draw(1);
        System.out.println("Number pyramid of height 3:");
        draw(3);
        System.out.println("Number pyramid of height 5:");
        draw(5);
        System.out.println("Number pyramid of height 8:");
        draw(8);
    }
}
