package org.example.InsertionSort;

import java.util.Random;

public class InsertionSort {
    //суть сортировки заключается в том чтомы ищем место для элемента на котором находимся между эементами которые больше и меньше нашего, и так в цикле пока все не отсортируется
    public static void main(String[] args) {
        long time = System.currentTimeMillis();

        int[] array = new int[10];
        Random rd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(101);
            System.out.print(array[i] + " ");
        }

        for (int i = 1; i < array.length; i++) {
            int j;
            int swap = array[i];
            for (j = i; j > 0 && swap < array[j - 1]; j--) {
                array[j] = array[j - 1];
            }
            array[j] = swap;
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Затраченное время: " + (System.currentTimeMillis()-time));
    }

}
