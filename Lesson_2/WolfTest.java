public class WolfTest {
	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();
		wolfOne.name = "Arno";
		System.out.println(wolfOne.name);
		wolfOne.age = 5;
		System.out.println(wolfOne.age);
		wolfOne.gender = "male";
		System.out.println(wolfOne.gender);
		wolfOne.height = 19.4;
		System.out.println(wolfOne.height);
		wolfOne.color = "Ginger";
		System.out.println(wolfOne.color);

		System.out.println(wolfOne.walk());
		wolfOne.seat();
		wolfOne.run();
		wolfOne.howl();
		wolfOne.hunt();
	}
}