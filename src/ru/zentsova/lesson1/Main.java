package ru.zentsova.lesson1;

public class Main {
    public static void main(String[] args) {
//        int[] array = new int[] {45, 1, 10, 30, 25};
        int[] array = new int[] {2, 36, 5, 21, 8, 13, 11, 20, 5, 4, 1};
        int medianInd = (array.length % 2 == 1) ? (array.length / 2) : (array.length / 2 - 1);
        System.out.println(String.valueOf(MathUtils.selection(array, medianInd)));
    }
}
