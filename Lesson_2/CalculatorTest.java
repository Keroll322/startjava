import java.util.Scanner;
public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите первое число: ");
		calc.setFirstNumber(sc.nextInt());

		System.out.println("Введите знак математической операции: ");
		calc.setMathOperation(sc.next().charAt(0));

		System.out.println("Введите второе число: ");
		calc.setSecondNumber(sc.nextInt());

		System.out.println(calc.calcul());
	}
}