package com.company;


import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int [][] array = new int[3][3];
        fillArray(array);





    }

    public static void findMaxModuleInRow(int [][]array)
    {
        int module = 0;
        int numberOfString = 0;
        int tempModule = 0;

        for (int i = 0; i<array.length;i++)
        {
            for (int j = 0; j<array[i].length;j++)
            {
                module+=array[i][j];
                tempModule = module;
                if(tempModule < module) tempModule = module;
            }
        }
    }

    public static void fillArray(int [][] array)
    {
        Random random = new Random();

        for (int i = 0; i<array.length;i++)
        {
            for (int j = 0;j<array[i].length;j++)
            {
                array[i][j] = random.nextInt(10);
            }
        }
    }

    public static void displayArray(int [][] array)
    {
        for (int i = 0; i<array.length;i++)
        {
            for (int j = 0;j<array[i].length;j++)
            {
                System.out.print(array[i][j]+" ");
            }
        }
    }
}
