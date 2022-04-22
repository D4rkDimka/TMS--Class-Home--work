package com.company;

public class Main {

    public static void main(String[] args) {
      Vector vector1 = new Vector(1,2,3);
      Vector vector2 = new Vector(3,2,1);
      Vector resultedVector = new Vector();
      double scalarProduct = 0;
      double angel = 0;

      vector1.displayVector();
      System.out.println("Vector 1 length: "+vector1.findLength());

      System.out.println();
      vector2.displayVector();
      System.out.println("Vector 2 length: "+vector2.findLength());

      angel = resultedVector.findAngel(vector1,vector2);
      System.out.println("Angel: "+ scalarProduct);

      scalarProduct = resultedVector.findScalarProduct(vector1,vector2);
      System.out.println("Scalar product: "+ scalarProduct);

      System.out.println("Vectors product: ");
      resultedVector.findVectorsProduct(vector1,vector2);
      resultedVector.displayVector();

      System.out.println("Resulted Length: "+ resultedVector.findLength());

    }
}
