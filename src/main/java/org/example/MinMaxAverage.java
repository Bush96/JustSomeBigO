package org.example;

import java.util.Arrays;
import java.util.Random;

public class MinMaxAverage {
    public static void main(String[] args) {


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
}}