package com.company;

public class Vector {
    private double x;
    private double y;
    private double z;
    Vector() {}

    Vector (double x,double y,double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double findLength()
    {
        double lenght = Math.sqrt(Math.pow(this.getX(),2)+Math.pow(this.getY(),2)+Math.pow(this.getZ(),2));

        return lenght;
    }

    public double findScalarProduct(Vector firstVector,Vector secondVector)
    {
        double scalarProduct = firstVector.getX() * secondVector.getX()+ firstVector.getY()*secondVector.getY()+firstVector.getZ()*secondVector.getZ();

        return scalarProduct;
    }

    public Vector findVectorsProduct(Vector firstVector,Vector secondVector)
    {
        Vector resultedVector = new Vector();

        resultedVector.setX(firstVector.getY()*secondVector.getZ() - firstVector.getZ()* secondVector.getY());
        resultedVector.setY(firstVector.getZ()*secondVector.getX() - firstVector.getX()* secondVector.getZ());
        resultedVector.setZ(firstVector.getX()* secondVector.getY() - firstVector.getY()*secondVector.getX());

        return  resultedVector;
    }

    public double findAngel(Vector firstVector,Vector secondVector)
    {
        double scalarProduct = findScalarProduct(firstVector,secondVector);

        double angel = scalarProduct/ Math.abs(firstVector.findLength()) * Math.abs(secondVector.findLength());

        return angel;
    }

    public Vector findSum(Vector firstVector,Vector secondVector)
    {
        Vector resultedVector = new Vector();

        resultedVector.setX(firstVector.getX()+secondVector.getX());
        resultedVector.setY(firstVector.getY()+secondVector.getY());
        resultedVector.setZ(firstVector.getZ()+secondVector.getZ());

        return resultedVector;
    }

    public Vector findDifference(Vector fisrtVector,Vector secondVector)
    {
        Vector resultedVector = new Vector();

        resultedVector.setX(fisrtVector.getX()-secondVector.getX());
        resultedVector.setY(fisrtVector.getY()-secondVector.getY());
        resultedVector.setZ(fisrtVector.getZ()-secondVector.getZ());

        return resultedVector;
    }

    public void displayVector()
    {
        System.out.println("X = "+ this.getX());
        System.out.println("Y = "+ this.getY());
        System.out.println("Z = "+ this.getZ());
    }

    void setX(double x) {this.x = x;}
    double getX() {return this.x;}

    void setY(double y) {this.y = y;}
    double getY() {return this.y;}

    void setZ(double z) {this.z = z;}
    double getZ() {return this.z;}
}
