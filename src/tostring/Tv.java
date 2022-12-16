package tostring;

public class Tv {

	int cost;
	String name;
	String type;

	Tv(int cost, String name, String type) {
		this.cost = cost;
		this.name = name;
		this.type = type;
	}

	public String toString() {
		return this.cost + " " + this.type + " " + this.name;
	}

	public static void main(String[] args) {
		Tv t = new Tv(88000,"Lg", "LED");
		System.out.println(t);
	}



}
