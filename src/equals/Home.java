package equals;

public class Home {
	int cost;
	String name;
	String color;

   Home(int cost, String name, String color) {
		this.cost = cost;
		this.name = name;
		this.color = color;
	}

	public boolean equals(Object Obj) {
		Home h2 = (Home) Obj;
		return this.cost == h2.cost;
	}

		public static void main(String[] args) {
			Home h = new Home(200000, "radhe", "orrenge");
			Home h2 = new Home(200000, "kiran", "yellow");
			h.equals(h2);
		}

}
	
