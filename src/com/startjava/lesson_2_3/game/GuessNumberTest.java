package com.startjava.lesson_2_3.game;

import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer = "да";
		while (answer.equals("да")) {
			System.out.println("Player1, ваше имя: ");
			Player player1 = new Player(sc.next());

			System.out.println("Player2, ваше имя: ");
			Player player2 = new Player(sc.next());

			GuessNumber game = new GuessNumber(player1, player2);
			game.startGame();

			do {
				System.out.println("Хотите продолжить? [да/нет]: ");
				answer = sc.next();
			} while (!answer.equals("да") && !answer.equals("нет"));
		}
	}
}