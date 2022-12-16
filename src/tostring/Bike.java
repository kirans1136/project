package tostring;

public class Bike {

	int cost;
	String color;
	String brand;

	Bike(int cost, String color, String brand) {
		this.cost = cost;
		this.color = color;
		this.brand = brand;
	}

	public String toString() {
		return this.cost + " " + this.brand + " " + this.color;
	}

	public static void main(String[] args) {
		Bike b = new Bike(200000, "black", "NS");
		System.out.println(b);
	}

}
