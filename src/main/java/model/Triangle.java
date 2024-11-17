package model;

public class Triangle extends Shape{
    double sideA;
    double sideB;
    double sideC;

    public Triangle(double sideA, double sideB, double sideC, Color color){
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea(){
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public double getPerimeter(){
        return sideA + sideB + sideC;
    }
}
