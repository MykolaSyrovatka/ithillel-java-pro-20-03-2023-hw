package ua.ithilell.hw10;

import java.util.concurrent.Callable;

public class Calculator implements Callable {
    private float [] halfNumbers;
    private int index;
    private int cycleLength;
    public Calculator(int index, int cycleLength, float[] halfNumbers) {
        this.index = index;
        this.halfNumbers = halfNumbers;
    }
    @Override
    public float[] call() throws Exception {
        float[] newNumbers = new float[halfNumbers.length];
        for (int i=index; i<halfNumbers.length+index; i++){
            newNumbers[i-index] = (float)(halfNumbers[i-index] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        return newNumbers;
    }
}
