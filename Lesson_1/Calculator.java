public class Calculator {
	public static void main(String[] args) {
		int a = 2;
		int b = 8;
		int result = 1;
		char mathOperation = '^';
		if(mathOperation == '+') {
			result = a + b;
			System.out.println(result);
		} else if(mathOperation == '-') {
			result = a - b;
			System.out.println(result);
		} else if(mathOperation == '/') {
			result = a / b;
			System.out.println(result);
		} else if(mathOperation == '*') {
			result = a * b;
			System.out.println(result);
		} else if(mathOperation == '%') {
			result = a % b;
			System.out.println(result);
		} else if(mathOperation == '^') {
			for(int i = 1; i <= b; i++)
				result *= a;
			System.out.println(result);
		}
	}
}