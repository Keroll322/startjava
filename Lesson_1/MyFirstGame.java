public class MyFirstGame {
	public static void main(String[] args) {
		int hiddenNumber =65;
		int enterNumber = 57;
		do {
			if (enterNumber > hiddenNumber) {
				System.out.println("Введенное вами число больше того, что загадал компьютер");
				enterNumber--;
			} else if (enterNumber < hiddenNumber) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер");
				enterNumber++;
			} 
		} while (enterNumber != hiddenNumber);
		System.out.println("Вы угадали!");
	}
}