package com.startjava.lesson_2_3.person;

public class Person {

	String gender = "male";
	String name = "Denis";
	double height = 193.1;
	double weight = 82.7;
	int age = 25;

	void walk() {
		System.out.println("Вы прошли 2 км");
	}

	void seat() {
		System.out.println("Вы сидели 20 минут");
	}

	void run() {
		System.out.println("Вы пробежали 4 км");
	}

	void talk() {
		System.out.println("Вы говорили сегодня с другом");
	}

	boolean studyJava() {
		System.out.println("Вы сегодня учили Java 5 часов");
		return true;
	}
}