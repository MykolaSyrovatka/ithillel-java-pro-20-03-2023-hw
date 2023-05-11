package ua.ithilell.hw10;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ValueCalculator {
    private float[] numbers;
    private int numbersLength = 0;
    private int halfNumbersLength;

    public ValueCalculator(float[] numbers) {
        this.numbers = numbers;
        this.numbersLength = numbers.length;
        this.halfNumbersLength = numbersLength/2;
    }


    private boolean isEven(){
        return ((numbersLength%2)==0)?true:false;
    }

    public void calculate(){
        long start = System.currentTimeMillis();
        float[] halfNumbersOne = null;
        float[] halfNumbersTwo = null;
        for (int i=0; i<numbersLength; i++){
            numbers[i]=10F;
        }
        if (isEven()){
            halfNumbersOne = new float[halfNumbersLength];
            halfNumbersTwo = new float[halfNumbersLength];
            System.arraycopy(numbers,0,halfNumbersOne,0, halfNumbersLength);
            System.arraycopy(numbers, halfNumbersLength, halfNumbersTwo,0, halfNumbersLength);
        } else {
            halfNumbersOne = new float[halfNumbersLength+1];
            halfNumbersTwo = new float[halfNumbersLength];
            System.arraycopy(numbers,0,halfNumbersOne,0, halfNumbersLength+1);
            System.arraycopy(numbers,halfNumbersLength+1, halfNumbersTwo,0, halfNumbersLength);
        }

        Calculator calculatorOne = new Calculator(0, numbersLength, halfNumbersOne);
        Calculator calculatorTwo = new Calculator(halfNumbersOne.length, numbersLength, halfNumbersTwo);
        FutureTask<float[]> futureTaskOne = new FutureTask<>(calculatorOne);
        FutureTask<float[]> futureTaskTwo = new FutureTask<>(calculatorTwo);
        Thread threadOne = new Thread(futureTaskOne);
        Thread threadTwo = new Thread(futureTaskTwo);
        threadOne.start();
        threadTwo.start();
        try {
            halfNumbersOne=futureTaskOne.get();
            halfNumbersTwo=futureTaskTwo.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        if (isEven()){
            System.arraycopy(halfNumbersOne,0,numbers,0, halfNumbersLength);
            System.arraycopy(halfNumbersTwo, 0, numbers, halfNumbersLength, halfNumbersLength);
        } else {
            System.arraycopy(halfNumbersOne,0,numbers,0, halfNumbersLength+1);
            System.arraycopy(halfNumbersTwo,0, numbers,halfNumbersLength+1, halfNumbersLength);
        }

        long stop = System.currentTimeMillis();

        System.out.println(stop - start);

    }
    public float[] getNumbers() {
        return numbers;
    }
    public int getNumbersLength() {
        return numbersLength;
    }
    public int getHalfNumbersLength() {
        return halfNumbersLength;
    }





}
