package org.example.BubbleSort;

import java.util.Arrays;

public class BubbleSort {

    //Сортировка закючается в в том что мы перемещаем указатель на первый элемент и сравниваем его со следующим, при необходимости меняем местами и начинаем проверку массива занова с 1 элемента
    //+ еобходимо добавлять булевское условие цикла в цикле чтобы пвторять действие пока массив полность не будет отсортирован
    public static void main(String[] args) {

        int[] array = {10, 2, 10, 3, 1, 2, 5};
        System.out.println(Arrays.toString(array));
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i - 1);
                    needIteration = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void swap(int[] arr1, int int1, int int2) {
        int temp = arr1[int1];
        arr1[int1] = arr1[int2];
        arr1[int2] = temp;
    }
}
