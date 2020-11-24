package com.startjava.lesson_1.conditional_statement;

public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 23;
		if(age > 20) {
			System.out.println("Вы взрослый");
		}

		boolean maleGender = false;
		if(maleGender) {
			System.out.println("Вы мужчина");
		}

		if(!maleGender) {
			System.out.println("Вы женщина");
		}

		double height = 1.90;
		if(height < 1.80) {
			System.out.println("Ваш рост низкий");
		} else {
			System.out.println("Ваш рост выше среднего");
		}

		char firstLetterName = 'M';
		if(firstLetterName == 'M') {
			System.out.println("Ваше имя начинается на M");
		} else if(firstLetterName == 'I') {
			System.out.println("Ваше имя начинается на I");
		} else {
			System.out.println("Ваше имя не начинается на букву I или M");
		}
	}
}