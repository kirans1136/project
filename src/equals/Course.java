package equals;

public class Course {
	String name;
	String uniname;
	double fees;

	Course(String name, String uniname, double fees) {
		this.name = name;
		this.uniname = uniname;
		this.fees = fees;
	}

	public boolean equals(Object Obj) {
		Course c2 = (Course) Obj;
		return this.uniname == c2.uniname;
	}

	public static void main(String[] args) {
		Course c = new Course("java", "jspider", 50000.86);
		Course c2 = new Course("python", "jspider", 52000.83);
		c.equals(c2);
	}

}
