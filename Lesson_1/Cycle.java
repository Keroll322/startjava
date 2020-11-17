public class Cycle {
	public static void main(String[] args) {
		for(int i = 0;i <= 20;i++) {
			System.out.println(i);
		}
		System.out.println();

		int k = 6;
		while(k >= -6) {
			System.out.println(k);
			k -= 2;
		}
		System.out.println();

		int s = 10;
        int sum = 0;
        do {
            if(s % 2 != 0) {
                sum = sum + s;
                s++;
            } else {
                s++;
            }
        }
        while (s <= 20);
        System.out.println(sum);
	}
}