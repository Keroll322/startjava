public class Wolf {

	private String gender;
	private String name;
	private double height;
	private int age;
	private String color;

	public boolean walk() {
		return true;
	}

	public void seat() {

	}

	public void run() {
		System.out.println("Собака умеет быстро бегать");
	}

	public void howl() {

	}

	public void hunt() {

	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		if(age > 8) {
			System.out.println("Некорректный возраст");
		} else {
			this.age = age;
		}
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getGender() {
		return gender;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getHeight() {
		return height;
	}

	public String getColor() {
		return color;
	}
}