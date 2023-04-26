package ua.ithilell.hw8.figures;

public class Circle implements Figure{

    private double r;

    public Circle(double r) {
        this.r = r;
    }
    @Override
    public double area() {
        return Math.PI*(r*r);
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
