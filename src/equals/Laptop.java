package equals;


public class Laptop {
	int cost;
	String name;
	String brand;

	Laptop(int cost, String name, String brand) {
		this.cost = cost;
		this.name = name;
		this.brand = brand;
	}

	public boolean equals(Object Obj) {
		Laptop l2 = (Laptop) Obj;
		return this.brand == l2.brand;
	}

	public static void main(String[] args) {
		Laptop l= new Laptop(100000, "thinkpad", "lenovo");
		Laptop l2= new Laptop(90000, "realpad", "lenovo");
		l.equals(l2);
	}

}
