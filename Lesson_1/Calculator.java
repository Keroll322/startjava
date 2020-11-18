public class Calculator {
	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		int result;
		if(a == 4 & b == 5) {
			result = a + b;
			System.out.println(result);
		} else if(a == 8 & b == 6) {
			result = a - b;
			System.out.println(result);
		} else if(a == 9 & b == 3) {
			result = a / b;
			System.out.println(result);
		} else if(a == 4 & b == 3) {
			result = a * b;
			System.out.println(result);
		} else if(a == 6 & b == 4) {
			result = a % b;
			System.out.println(result);
		} else if(a == 2) {
			result = a *= a;
			System.out.println(result);
		}
	}
}