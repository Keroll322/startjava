package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String answer;

        do {
            System.out.print("Введите математическое выражение: ");
            String mathExpression = sc.next();
            String[] elements = mathExpression.split("");
            calculator.setFirstNumber(Integer.parseInt(elements[0]));
            calculator.setMathOperation(elements[1].charAt(0));
            calculator.setSecondNumber(Integer.parseInt(elements[2]));

            System.out.println(calculator.calculate());

            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                answer = sc.next();
            } while (!answer.equals("да") && !answer.equals("нет"));
        } while (answer.equals("да"));
    }
}
