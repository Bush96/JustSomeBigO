package org.example;

import java.util.Arrays;
import java.util.Random;

public class MinMaxAverage {


    public static void main(String[] args) {
        int[] myArray = {1, 3, 5, 4, 3, 8, 9};        //for deleting;
        removeElement(myArray, 3);



        int[] arr = new int[10];
        Random rd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(101);
            System.out.print(arr[i] + " ");
        }
////////////////MIN/////////////////////////
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println();
        System.out.println("Min is: " + min);

////////////////////MAX//////////////////////
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println("Max is: " + max);


//////////////////AVERAGE///////////////////
        double average = arr[0];
        for (int i = 0; i < arr.length; i++) {
            average += (arr[i] / arr.length);
        }
        System.out.println("Average:  " + average);

//////////////////findSimpleNumber///////////////////
        for(int i = 2; i <= 100; i ++){
            boolean isPrime = true;          //переменная для фиксирования и печати результта

            for(int j = 2; j < i; j++){
                if(i % j == 0){                  //просто число делится без остатка только на себя
                    isPrime = false;             //если какое то число делится без остатка на предыдушие себе, значит обрываем цикл оно не подходит
                    break;
                }
            }

            if(isPrime){                     //если цикл не обрывался отпечатываем результат
                System.out.println(i);
            }

    }}

    //////////////////DeletingElements///////////////////
    public static int[] removeElement(int[] myArray, int num) {
        int count = myArray.length;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == num) {
                count--;                   //счетччик нужен чтобы узнать длину нвого массива
            }

        }
        int[] newArray = Arrays.copyOf(myArray, count);
        int offset = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == num) {
                offset++;
            } else {
                newArray[i - offset] = myArray[i];            //тут прикольный прикол посмотри и вспомнишь
            }
        }
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }
}