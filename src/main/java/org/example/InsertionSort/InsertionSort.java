package org.example.InsertionSort;

import java.util.Random;

public class InsertionSort {
    //массив постепенно перебирается слева направо. При этом элемент
    // сравнивается со всеми предыдущими элементами и размещается так,
    // чтобы оказаться в подходящем месте среди ранее упорядоченных элементов
    public static void main(String[] args) {
        long time = System.currentTimeMillis();

        int[] array = new int[10];
        Random rd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(101);
            System.out.print(array[i] + " ");
        }

        for (int i = 1; i < array.length; i++) {
            int current = array[i];             //запоминаем элемент
            int j = i;                       //для внутреннего цикла создаем переменную изначально равную и
            while (j > 0 && array[j - 1] > current) {    //будем сдвигать элемента ПОКА либо не дойдем до начала массива ЛИБО не наткнемся на знаение выше запомнившегося
                array[j] = array[j - 1];
                j--;
            }
            array[j] = current;       //сюда нужно вставить тот элемент чтобы все было отсортировано
        }

        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Затраченное время: " + (System.currentTimeMillis() - time));
    }
}
