package ua.ithilell.hw7;

import ua.ithilell.hw7.exceptions.ArrayDataException;
import ua.ithilell.hw7.exceptions.ArraySizeException;

public class HomeWorkMain {

    public static void main(String[] args) {
        String [][] matrixNumbersOne = {
                {"1", "2", "3", "2147483647"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        String [][] matrixNumbersTwo = {
                {"a", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "s", "3", "4"},
                {"1", "2", "3", "4"}
        };

        String [][] matrixNumbersThree = {
                {"a", "2", "3"},
                {"1", "2", "3", "4"},
                {"1", "4"},
                {"1"}
        };
        String [][] matrixNumbersFour = {};

        ArrayValueCalculator arrayValueCalculator = new ArrayValueCalculator();

        try {
            System.out.println(arrayValueCalculator.doCalc(matrixNumbersOne));
        } catch (ArraySizeException e) {
            System.err.println(e);
        } catch (ArrayDataException e) {
            System.err.println(e);
        }

        try {
            System.out.println(arrayValueCalculator.doCalc(matrixNumbersTwo));
        } catch (ArraySizeException e) {
            System.err.println(e);
        } catch (ArrayDataException e) {
            System.err.println(e);
        }

        try {
            System.out.println(arrayValueCalculator.doCalc(matrixNumbersThree));
        } catch (ArraySizeException e) {
            System.err.println(e);
        } catch (ArrayDataException e) {
            System.err.println(e);
        }

        try {
            System.out.println(arrayValueCalculator.doCalc(matrixNumbersFour));
        } catch (ArraySizeException e) {
            System.err.println(e);
        } catch (ArrayDataException e) {
            System.err.println(e);
        }


    }

}
