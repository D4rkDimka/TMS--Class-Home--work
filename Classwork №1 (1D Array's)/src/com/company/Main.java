package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[6];
        FillArray(array);
        findMinElement(array);
        findMaxElement(array);
    }

    public static void PrintArray(int[] array) {
        System.out.printf("\tArray\n");
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }

    public static void FindInArray(int number, int[] array) {
        boolean isFinded = false;
        int indexInArray = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                isFinded = true;
                indexInArray = i;
            }

        }
        if (isFinded == true)
            System.out.printf("\nNumber " + number + " is found in array and his index is " + indexInArray + "\n");
        else System.out.println("\nThere are no elements in array with such value!");
    }

    public static void FillArray(int[] array) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter element in array: ");

        for (int i = 0; i < array.length; i++) {

            System.out.print("\narray[" + i + "] = ");
            array[i] = in.nextInt();
        }
    }

    public static int findMaxElement(int []array)
    {
        int maxElement = 0;


        for (int i = 0; i < array.length;i++)
        {
            if(array[i] > maxElement) maxElement = array[i];
        }

        for (int i = 0; i < array.length;i++)
        {
            if(array[i] > maxElement) maxElement = array[i];

        }
        System.out.printf("\nMax element is "+ maxElement);

        return maxElement;
    }

    public static int findMinElement(int []array)
    {
        int minElement = 0;

        for (int i = 0; i < array.length;i++)
        {
            if(array[i] > minElement) minElement = array[i];
        }

        for (int i = 0; i < array.length;i++)
        {
            if(array[i] < minElement) minElement = array[i];
        }

        System.out.printf("\nMin element is "+ minElement);

        return minElement;
    }
}
