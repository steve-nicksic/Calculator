package com.tts;

public class MagicCalculator extends Calculator {

    public double squareRt(int num1) {
        return Math.sqrt(num1);
    }

    public double sin(int num1) {
        return Math.sin(num1);
    }

    public double cosine(int num1) {
        return Math.cos(num1);
    }

    public double tangent(int num1) {
        return Math.tan(num1);
    }

    public long factorial(int num1) {
        int collector = 1;
        for (int i = 2; i <= num1; i++){
            collector *= i;
        }
            return collector;
        }

}
