package com.startjava.lesson_2_3.calculator;

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
				System.out.println(firstNumber + secondNumber);
				break;
			case '-':
				System.out.println(firstNumber - secondNumber);
				break;
			case '/':
				System.out.println(firstNumber / secondNumber);
				break;
			case '*':
				System.out.println(firstNumber * secondNumber);
				break;
			case '%':
				System.out.println(firstNumber % secondNumber);
				break;
			case '^':
				int result = 1;
				for(int i = 1; i <= secondNumber; i++) {
					result *= firstNumber;
				}
				System.out.println(result);
				break;
			default:
				System.out.println("Не верный математический знак");
		}
		return 0;
	}
}