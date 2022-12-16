package equalsmethod;



public class Bike1 {
	int cost;
	String color;
	String brand;

	Bike1(int cost, String color, String brand) {
		this.cost = cost;
		this.color = color;
		this.brand = brand;
	}
	public boolean equals(Object Obj){
		Bike1 b2=(Bike1)Obj;
		return this.brand==b2.brand;
	}

		public static void main(String[] args) {
			Bike1 b1 = new Bike1(210000, "blue", "NS");
			Bike1 b2 = new Bike1(200000, "black", "NS");
			b1.equals(b2);
		}
}
