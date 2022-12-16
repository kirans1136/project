package tostring;

public class Car {

	int cost;
	String name;
	String type;

	Car(int cost, String name, String type) {
		this.cost = cost;
		this.name = name;
		this.type = type;
	}

	public String toString() {
		return this.cost + " " + this.type + " " + this.name;
	}

	public static void main(String[] args) {
		Car c = new Car(200000, "kia", "deisel");
		System.out.println(c);
	}

}
