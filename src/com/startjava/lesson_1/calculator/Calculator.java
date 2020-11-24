package com.startjava.lesson_1.calculator;

public class Calculator {
	public static void main(String[] args) {
		int a = 2;
		int b = 8;
		int result = 1;
		char mathOperation = '^';
		if(mathOperation == '+') {
			System.out.println(a + b);
		} else if(mathOperation == '-') {
			System.out.println(a - b);
		} else if(mathOperation == '/') {
			System.out.println(a / b);
		} else if(mathOperation == '*') {
			System.out.println(a * b);
		} else if(mathOperation == '%') {
			System.out.println(a % b);
		} else if(mathOperation == '^') {
			for(int i = 1; i <= b; i++) {
				result *= a;
			}
			System.out.println(result);
		}
	}
}