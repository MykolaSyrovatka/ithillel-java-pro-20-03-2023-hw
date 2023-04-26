package ua.ithilell.hw7;

import ua.ithilell.hw7.exceptions.ArrayDataException;
import ua.ithilell.hw7.exceptions.ArraySizeException;

public class ArrayValueCalculator {
    public int doCalc(String [][] matrixNumbers) throws ArraySizeException, ArrayDataException {
        int sum = 0;
        int number = 0;

        if (matrixNumbers.length==4 && matrixNumbers[0].length == 4 && matrixNumbers[1].length == 4 && matrixNumbers[2].length == 4 && matrixNumbers[3].length == 4){
            for (int i=0; i<4; i++){
                for (int j=0; j<4; j++){
                    if (matrixNumbers[i][j] != null && matrixNumbers[i][j].matches("[0-9]+")){
                       sum += Integer.parseInt(matrixNumbers[i][j]);



                    } else {
                        throw new ArrayDataException("In cell [" + i + "] [" + j + "] of the array is not a number");
                    }
                }
            }
        } else {
            throw new ArraySizeException("Invalid array size");
        }
        return sum;
    }
}
