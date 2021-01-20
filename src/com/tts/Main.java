package com.tts;
import com.tts.Calculator;
import com.tts.MagicCalculator;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        MagicCalculator magicCalculator = new MagicCalculator();

        //Calculator
        System.out.println("Add Method");
        System.out.println(calculator.add(343, 2542));

        System.out.println("Subtraction Method");
        System.out.println(calculator.subtract(72,33));

        System.out.println("Multiplication Method");
        System.out.println(calculator.multiply(11,11));

        System.out.println("Division Method");
        System.out.println(calculator.divide(27, 3));

        System.out.println("Square Method");
        System.out.println(calculator.square(8));

        //Magic Calculator
        System.out.println("Square Root Method");
        System.out.println(magicCalculator.squareRt(87));

        System.out.println("sin Method");
        System.out.println(magicCalculator.sin(20));

        System.out.println("cosine Method");
        System.out.println(magicCalculator.cosine(20));

        System.out.println("tangent Method");
        System.out.println(magicCalculator.tangent(20));

        System.out.println("Factorial Method");
        System.out.println(magicCalculator.factorial(6));
    }
}
