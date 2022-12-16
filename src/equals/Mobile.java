package equals;

public class Mobile {
	int cost;
	String color;
	String brand;

	Mobile(int cost, String color, String brand) {
		this.cost = cost;
		this.color = color;
		this.brand = brand;
	}

	public  boolean equals(Object obj)
	{
		Mobile m3=(Mobile)obj;
		return (this.brand==m3.brand);
	}

	public static void main(String[] args) {
		Mobile m1 = new Mobile(20000, "blue", "vivo");
		Mobile m2 = new Mobile(23000, "black", "vivo");
		m1.equals(m2);
	}


}
