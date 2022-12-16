package tostring;

public class School {
	int fees;
	String name;
	char grade;

 School(int fees, String name, char garde) {
		this.fees = fees;
		this.name = name;
		this.grade= grade;

}

public String toString() {
	return this.fees + " " + this.grade + " " + this.name;
}

public static void main(String[] args) {
	School s= new School(44000,"st.philomina",'a');
	System.out.println(s);
}

}