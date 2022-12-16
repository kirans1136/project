package tostring;

public class Home {
	int cost;
	String name;
	String color;

   Home(int cost, String name, String color) {
		this.cost = cost;
		this.name = name;
		this.color = color;
	}

	public String toString() {
		return this.cost + " " + this.color + " " + this.name;
	}

	public static void main(String[] args) {
		Home h = new Home(200000, "radhe", "orrenge");
		System.out.println(h);
	}

}
