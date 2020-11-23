import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	private Player player1;
	private Player player2;

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void startGame() {
		Scanner sc = new Scanner(System.in);
		int hiddenNumber = new Random().nextInt(5);

		do {
			System.out.println(player1.getName() + " Введите число");
			player1.setNumber(sc.nextInt());

			if(player1.getNumber() < hiddenNumber) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер. Следующий игрок ");
			} else if (player1.getNumber() > hiddenNumber) {
				System.out.println("Введенное вами число больше того, что загадал компьютер. Следующий игрок ");
			} else {
				System.out.println(player1.getName() + " Вы угадали, загаданое число = " + hiddenNumber);
				break;
			}

			System.out.println(player2.getName() + " Введите число");
			player2.setNumber(sc.nextInt());

			if(player2.getNumber() < hiddenNumber) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер. Следующий игрок ");
			} else if (player2.getNumber() > hiddenNumber) {
				System.out.println("Введенное вами число больше того, что загадал компьютер. Следующий игрок ");
			} else {
				System.out.println(player2.getName() + " Вы угадали, загаданое число = " + hiddenNumber);
				break;
			}
		} while(true);
	}
}