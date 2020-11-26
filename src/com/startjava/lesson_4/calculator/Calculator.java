package com.startjava.lesson_4.calculator;

public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private char mathOperation;

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setMathOperation(char mathOperation) {
        this.mathOperation = mathOperation;
    }

    public int calculate() {
        switch(mathOperation) {
            case '+':
                return Math.addExact(firstNumber, secondNumber);
            case '-':
                return Math.subtractExact(firstNumber, secondNumber);
            case '/':
                return Math.floorDiv(firstNumber, secondNumber);
            case '*':
                return Math.multiplyExact(firstNumber, secondNumber);
            case '%':
                return (int) Math.IEEEremainder(firstNumber, secondNumber);
            case '^':
                return (int) Math.pow(firstNumber, secondNumber);
            default:
                System.out.println("Не верный математический знак");
        }
        return calculate();
    }
}