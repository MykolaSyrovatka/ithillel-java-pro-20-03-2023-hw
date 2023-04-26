package ua.ithilell.hw8.figures;

public class Square implements Figure{

    private double a;

    public Square(double a) {
        this.a = a;
    }


    @Override
    public double area() {
        return a*a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
}
