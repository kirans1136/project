package tostring;

public class Laptop {
		int cost;
		String name;
		String brand;

		Laptop(int cost, String name, String brand) {
			this.cost = cost;
			this.name = name;
			this.brand = brand;
		}

		public String toString()
		{
			return this.cost+" "+this.name+" "+this.brand;
		}

		public static void main(String[] args) {
			Laptop l= new Laptop(100000, "thinkpad", "lenovo");
			System.out.println(l);
		}

}
