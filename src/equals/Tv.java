package equals;


public class Tv {
	int cost;
	String name;
	String type;

	Tv(int cost, String name, String type) {
		this.cost = cost;
		this.name = name;
		this.type = type;
	}

public boolean equals(Object obj){
	Tv t2=(Tv)obj;
	return this.type==t2.type;
}

	public static void main(String[] args) {
		Tv t = new Tv(88000,"Lg", "LED");
		Tv t2= new Tv(88500,"oneplus", "LED");
		t.equals(t2);
	}

}


