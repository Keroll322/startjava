package com.startjava.lesson_2_3.robot;

public class JaegerTest {
	public static void main(String[] args) {
		Jaeger jaeger1 = new Jaeger();
		Jaeger jaeger2 = new Jaeger();

		jaeger1.setName("Gipsy Danger");
		jaeger2.setName("Cherno Alpha");
		jaeger1.setMark("Mark-3");
		jaeger2.setMark(jaeger1.getMark());
		jaeger1.setOrigin("USA");
		jaeger2.setOrigin("Russia");
		jaeger1.setHeight(260);
		jaeger2.setHeight(280);
		jaeger1.setWeight(1.9);
		jaeger2.setWeight(2.4);
		jaeger1.setSpeed(7);
		jaeger2.setSpeed(3);
		jaeger1.setStrenght(8);
		jaeger2.setStrenght(10);
		jaeger1.setArmor(6);
		jaeger2.setArmor(jaeger1.getArmor());

		System.out.println("name jaeger1 = " + jaeger1.getName());
		System.out.println("name jaeger2 = " + jaeger2.getName());
		System.out.println("armor jaeger1 = " + jaeger1.getArmor());
		System.out.println("armor jaeger2 = " + jaeger2.getArmor());

		jaeger1.run();
		jaeger2.shoot();
	}
}