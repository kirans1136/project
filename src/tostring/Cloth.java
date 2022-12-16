package tostring;

public class Cloth {

	int cost;
	String color;
	String brand;

	Cloth(int cost, String color, String brand) {
		this.cost = cost;
		this.color = color;
		this.brand = brand;
	}

	public String toString() {
		return this.cost + " " + this.brand + " " + this.color;
	}

	public static void main(String[] args) {
		Cloth c = new Cloth(2000, "red", "raymond");
		System.out.println(c);
	}

}


