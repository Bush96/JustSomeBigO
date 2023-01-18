package org.example.BubbleSort;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

    //Сортировка закючается в в том что мы перемещаем указатель на первый элемент и сравниваем его со следующим, при необходимости меняем местами и начинаем проверку массива занова с 1 элемента
    //+ еобходимо добавлять булевское условие цикла в цикле чтобы пвторять действие пока массив полность не будет отсортирован
    public static void main(String[] args) {
        long time = System.currentTimeMillis();

        int[] array = new int[10];
        Random rd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(101);
            System.out.print(array[i] + " ");
        }

        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;          //этот фолс сработает когда в очередной раз мы будем итерироваться п омассиву и ни разу не сработает условие ифа, т.е. нид итератион так и останется фолсам
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
//                    swap(array, i, i - 1);
                    needIteration = true;
                }
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(array));
        System.out.println("Затраченное время на сортировку: " + (System.currentTimeMillis() - time));

    }

//    private static void swap(int[] arr1, int int1, int int2) {
//        int temp = arr1[int1];
//        arr1[int1] = arr1[int2];
//        arr1[int2] = temp;
//    }
}
