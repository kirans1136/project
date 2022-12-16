package equals;

public class Cloth {

	int cost;
	String color;
	String brand;

	Cloth(int cost, String color, String brand) {
		this.cost = cost;
		this.color = color;
		this.brand = brand;
	}


	public boolean equals(Object Obj) {
		Cloth c1 = (Cloth) Obj;
		return this.brand == c1.brand;
	}

	public static void main(String[] args) {
		Cloth c = new Cloth(2000, "red", "raymond");
		Cloth c1 = new Cloth(2400, "blue", "raymond");
		c.equals(c1);
	}

}
