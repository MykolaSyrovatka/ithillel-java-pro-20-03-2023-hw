package ua.ithilell.hw10;

public class HomeWorkMain {


    public static void main(String[] args) {
        ValueCalculator valueCalculator = new ValueCalculator(new float[100000000]);
        System.out.println(valueCalculator.getNumbersLength());
        System.out.println(valueCalculator.getHalfNumbersLength());
        valueCalculator.calculate();
    }
}
