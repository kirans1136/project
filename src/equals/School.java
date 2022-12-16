package equals;

public class School {
	int fees;
	String name;
	char grade;

 School(int fees, String name, char garde) {
		this.fees = fees;
		this.name = name;
		this.grade= grade;

}

public boolean equals(Object obj){
	School s2=(School)obj;
	return this.fees==s2.fees;
}

public static void main(String[] args) {
	School s= new School(44000,"st.philomina",'a');
	School s2= new School(44000,"st.philominas",'b');
      s.equals(s2);
}
}
