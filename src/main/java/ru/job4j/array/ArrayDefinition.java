package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("Размер массива ages[] равен: " + ages.length);
        System.out.println("Размер массива surnames[] равен: " + surnames.length);
        System.out.println("Размер массива prices[] равен: " + prices.length);
        String[] names = new String[4];
        names[0] = "Alexandr Pushkin";
        names[1] = "Mihail Bulgakov";
        names[2] = "Fedor Dostoevsky";
        names[3] = "Sergey Esenin";
        for (String s: names) {
            System.out.println(s);
        }
    }
}
