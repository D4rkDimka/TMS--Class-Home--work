package com.company;

import java.util.Scanner;

public class Rhombus extends Figure{
    @Override
    void GetSquare() {
        Scanner in = new Scanner(System.in);

        double firstDiagonal;
        double secondDiagonal;

        System.out.println("Enter numbers of diagonals: ");
        System.out.print(">>");
        firstDiagonal = in.nextInt();
        System.out.print(">>");
        secondDiagonal = in.nextInt();

        System.out.println("Square: "+ (firstDiagonal*secondDiagonal)/2);
    }

    @Override
    void GetPerimeter() {

        Scanner in = new Scanner(System.in);
        int [] sides = new int[4];
        int perimeter = 0;

        System.out.println("Enter numbers of sides: ");
        for (int i = 0;i< sides.length;i++)
        {
            System.out.print(">>");
            sides[i] = in.nextInt();
            perimeter+=sides[i];
        }

        System.out.println("Perimeter: "+perimeter);
    }

    @Override
    void GetLength() {

    }
}
