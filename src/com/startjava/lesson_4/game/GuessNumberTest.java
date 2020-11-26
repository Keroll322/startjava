package com.startjava.lesson_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("У вас 10 попыток");

        System.out.print("Введите имя первого игрока: ");
        Player playerOne = new Player(sc.next());

        System.out.print("Введите имя второго игрока: ");
        Player playerTwo = new Player(sc.next());

        GuessNumber guessNumber = new GuessNumber(playerOne, playerTwo);
        String answer;
        do {
            guessNumber.startGame();
            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                answer = sc.next();
            } while (!answer.equals("да") && !answer.equals("нет"));
        } while (answer.equals("да"));
    }
}
