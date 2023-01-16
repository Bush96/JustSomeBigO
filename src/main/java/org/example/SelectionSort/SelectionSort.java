package org.example.SelectionSort;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        // проходим по массиву в поисках минимального элемента.
        // Найденный минимум меняем местами с первым элементом.
        // Неотсортированная часть массива уменьшилась на один элемент
        // (не включает первый элемент, куда мы переставили найденный минимум).
        // К этой неотсортированной части применяем те же действия — находим минимум
        // и ставим его на первое место в неотсортированной части массива.
        // И так продолжаем до тех пор, пока неотсортированная часть массива не уменьшится до одного элемента.
        long time = System.currentTimeMillis();

        int[] array1 = new int[10];
        Random rd = new Random();
        for (int i = 0; i < array1.length; i++) {
            array1[i] = rd.nextInt(101);
            System.out.print(array1[i] + " ");
        }
        int j = 0;
        for (int i = 0; i < array1.length - 1; i++) {
            for (j = i + 1; j < array1.length; j++) {
                int min = i;
                if (array1[j] < array1[i]) {
                    min = j;
                }
                if (min != i) {
                    int a = array1[i];
                    array1[i] = array1[j];
                    array1[j] = a;
                }
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(array1));
        System.out.println("Затраченное время на сортировку: " + (System.currentTimeMillis() - time));
    }

    private static void swap(int[] arr1, int int1, int int2) {
        int temp = arr1[int1];
        arr1[int1] = arr1[int2];
        arr1[int2] = temp;
    }
}
