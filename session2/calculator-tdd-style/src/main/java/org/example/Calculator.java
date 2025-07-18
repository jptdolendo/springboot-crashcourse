package org.example;

public class Calculator {

    //Addition
    public int add(int numOne, int numTwo) {
        return numOne + numTwo;
    }

    public long add(long numOne, long numTwo) {
        return numOne + numTwo;
    }

    public short add(short numOne, short numTwo) {
        return (short) (numOne + numTwo);
    }

    public float add(float numOne, float numTwo) {
        return numOne + numTwo;
    }

    public double add(double numOne, double numTwo) {
        return numOne + numTwo;
    }

    //Subtract

    public int subtract(int numOne, int numTwo) {
        return numOne - numTwo;
    }

    public long subtract(long numOne, long numTwo) {
        return numOne - numTwo;
    }

    public short subtract(short numOne, short numTwo) {
        return (short) (numOne - numTwo);
    }

    public float subtract(float numOne, float numTwo) {
        return numOne - numTwo;
    }

    public double subtract(double numOne, double numTwo) {
        return numOne - numTwo;
    }


    //Multiply

    public int multiply(int numOne, int numTwo) {
        return numOne * numTwo;
    }

    public long multiply(long numOne, long numTwo) {
        return numOne * numTwo;
    }

    public short multiply(short numOne, short numTwo) {
        return (short) (numOne * numTwo);
    }

    public float multiply(float numOne, float numTwo) {
        return numOne * numTwo;
    }

    public double multiply(double numOne, double numTwo) {
        return numOne * numTwo;
    }


    //Divide

    public int divide(int numOne, int numTwo) {
        return numOne / numTwo;
    }

    public long divide(long numOne, long numTwo) {
        return numOne / numTwo;
    }

    public short divide(short numOne, short numTwo) {
        return (short) (numOne / numTwo);
    }

    public float divide(float numOne, float numTwo) {
        return numOne / numTwo;
    }

    public double divide(double numOne, double numTwo) {
        if (numTwo == 0.0) throw new ArithmeticException("Division by zero");
        return numOne / numTwo;
    }
}
