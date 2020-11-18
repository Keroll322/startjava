public class Cycle {
	public static void main(String[] args) {
		for(int i = 0; i <= 20; i++) {
			System.out.println(i);
		}
		System.out.println();

		int counter = 6;
		while(counter >= -6) {
			System.out.println(counter);
			counter -= 2;
		}
		System.out.println();

		int s = 10;
		int sum = 0;
		int k = 10;
		do {
			if(s % 2 != 0) {
				sum += s;
				s++;
			} else {
				k++;
				s = k;
			}
		} while (s <= 20);
			System.out.println(sum);
	}
}
