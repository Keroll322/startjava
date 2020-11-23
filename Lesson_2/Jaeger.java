public class Jaeger {
	private String name;
	private String mark;
	private String origin;
	private double height;
	private double weight;
	private int speed;
	private int strenght;
	private int armor;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getMark() {
		return mark;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getOrigin() {
		return origin;
	}

	public void setHeight(double height) {
		this.height = height;
	}

		public double getHeight() {
		return height;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setStrenght(int strenght) {
		this.strenght = strenght;
	}

	public int getStrenght() {
		return strenght;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public int getArmor() {
		return armor;
	}

	
	public void run() {
		System.out.println("Вы бежите");
	}

	public void jump() {
		System.out.println("Вы прыгаете");
	}

	public void shoot() {
		System.out.println("Вы стреляете");
	}
}