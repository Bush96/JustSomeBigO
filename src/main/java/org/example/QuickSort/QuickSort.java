package org.example.QuickSort;

import java.util.Arrays;
import java.util.Random;

//Не самая скоростная сортировка, но часто применяется например в выхове Arrayss.sort из стандартной библиотеки джава
//Идея в том что массив делится пополам от любого элемента в массиве и эти как бы два подмассива стараются иметь такой вид чтобы в одной части находиись
//элементы больше выбранного любого элемента а с другой стороны меньше от него
//одна сторона находит у себя неподходящий элемент и вторая сторона так же, после они менятся этими элементами и массив снва делится запуская все это по кругу пока остается чтото несортированное
public class QuickSort {
    public static void main(String args[]) {
        long time = System.currentTimeMillis();
        int[] array = new int[10];
        Random rd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(100);
            System.out.print(array[i] + " ");
        }
        quickSort(array, 0, array.length - 1);
        System.out.println();
        for (int i =0; i<array.length; i++){

            System.out.print(array[i] + " ");
        }
        System.out.print("Затраченное время: " + (System.currentTimeMillis()-time));
    }

    public static void quickSort(int[] array, int from, int to) {
        if (from < to) {               //это значит чт в подмассиве не соталось элементов для сортировки и все готово
            int divideIndex = partition(array, from, to);        //этот элемент будет указывать на то поожение элемент которого будет разделять элемент на две части
//
            quickSort(array, from, divideIndex - 1);          //применяем рекурсию для все большего деления подмассивов (т е передаем сюда уже не весь массив а до и от тог самого пивота среднего элемента)
            quickSort(array, divideIndex, to);                    //

        }
    }

    private static int partition(int[] array, int from, int to) {
        int rightIndex = to;   //ставим указатель на начало массива
        int leftIndex = from;         //ставим указатель на конец массива

        int pivot = array[from+(to-from)/2];            //рандомно выбираем любое число
        while (leftIndex<=rightIndex){

            while(array[leftIndex]<pivot){   //начинаем движение с левой части массива в правую пока не найдем элемент который явзяется больши пивота
                leftIndex++;
            }
            while (array[rightIndex]>pivot){        //тоже самое движемся в обратную сторону пока не найдем число меньше пивота
                rightIndex--;
            }

            if ( leftIndex<=rightIndex){             //тут те элементы что мы нашли выше меняются местами 
                swap (array, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;   //если пары не находим то деление проиводится по тому элементу которому пару мы не нашли
    }

    private static void swap(int[] array, int rightIndex, int leftIndex) {
        int temp = array[rightIndex];
        array[rightIndex] = array[leftIndex];
        array[leftIndex] = temp;
    }
}