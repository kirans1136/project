package tostring;

public class Course {
	String name;
	String uniname;
	double fees;
	Course(String name,String uniname,double fees)
	{
		this.name= name;
		this.uniname=uniname;
		this.fees=fees;
	}
	public String toString() {
		return this.name + " " + this.uniname + " " + this.fees;
	}

	public static void main(String[] args) {
		Course c = new Course( "java", "jspider",50000.86);
		System.out.println(c);
	}
	

}
