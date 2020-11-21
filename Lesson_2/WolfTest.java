public class WolfTest {
	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();
		wolfOne.setGender("male");
		wolfOne.setName("Arno");
		wolfOne.setAge(5);
		wolfOne.setHeight(21.4);
		wolfOne.setColor("Ginger");

		wolfOne.getGender();
		System.out.println("gender = " + wolfOne.getGender());
		wolfOne.getName();
		System.out.println("name = " + wolfOne.getName());
		wolfOne.getAge();
		System.out.println("age = " + wolfOne.getAge());
		wolfOne.getHeight();
		System.out.println("height = " + wolfOne.getHeight());
		wolfOne.getColor();
		System.out.println("color = " + wolfOne.getColor());
	}
}