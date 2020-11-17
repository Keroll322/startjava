public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 18;
		boolean male = false;
		double height = 1.90;
		String firstLetterName = "K";//не могу догодаться как сделать без String

		if(age > 20) {
			System.out.println("Вы взрослый");
		} else if(male) {
			System.out.println("Вы мужчина");
		} else if(!male) {
			System.out.println("Вы не мужчина");
		} else if(height < 1.80) {
			System.out.println("Ваш рост низкий");
		} else {
			System.out.println("У вас всё хорошо");
		}

		if(firstLetterName == "M") {
			System.out.println("Ваше имя начинается на M");
		} else if(firstLetterName == "I") {
			System.out.println("Ваше имя начинается на I");
		} else {
			System.out.println("Ваше имя не начинается на букву I или M");
		}
	}
}