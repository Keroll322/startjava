public class MyFirstGame {
	public static void main(String[] args) {
		int answerUser =65;
		int answer = 57;
		while(answerUser != answer) {
			System.out.println("Введенное вами число больше того, что загадал компьютер");
			answerUser--;
			if(answerUser == answer) {
				System.out.println("Вы угадали!");
			}
		}
	}
}