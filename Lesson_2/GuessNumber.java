import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	private Player player1;
	private Player player2;
	private int hiddenNumber = new Random().nextInt(101);
	private Scanner sc = new Scanner(System.in);

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void startGame() {
		while(true) {
			inputNumber(player1);
			if (compareNumbers(player1)) {
				break;
			}
			inputNumber(player2);
			if (compareNumbers(player2)) {
				break;
			}
		}
	}

	private void inputNumber(Player player) {
		System.out.println(player.getName() + "Введите число");
		player.setNumber(sc.nextInt());
	}

	private boolean compareNumbers(Player player) {
		if(player.getNumber() < hiddenNumber) {
			System.out.println("Введенное вами число меньше того, что загадал компьютер. Следующий игрок ");
		} else if (player.getNumber() > hiddenNumber) {
			System.out.println("Введенное вами число больше того, что загадал компьютер. Следующий игрок ");
		} else if (player.getNumber() == hiddenNumber) {
			System.out.println(player.getName() + " Вы угадали, загаданое число = " + hiddenNumber);
			return true;
		}
		return false;
	}
}