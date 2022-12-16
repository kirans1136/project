package tostring;

public class Mobile {
	int cost;
	String color;
	String brand;

	Mobile(int cost, String color, String brand) {
		this.cost = cost;
		this.color = color;
		this.brand = brand;
	}

	public String toString()
	{
		return this.cost+" "+this.brand+" "+this.color;
	}

	public static void main(String[] args) {
		Mobile m = new Mobile(20000, "blue", "vivo");
		System.out.println(m);
	}

}
