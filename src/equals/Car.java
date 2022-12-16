package equals;


public class Car {

	int cost;
	String name;
	String type;

	Car(int cost, String name, String type) {
		this.cost = cost;
		this.name = name;
		this.type = type;
	}

	public boolean equals(Object obj) {
		Car c2=(Car)obj;
		return this.cost==c2.cost;
	}

	public static void main(String[] args) {
		Car c = new Car(200000, "kia", "deisel");
		Car c2 = new Car(200000, "verna", "petrol");
        c.equals(c2);
	}

}



