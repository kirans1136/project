package tostring;

public class Employee {
	int sal;
	String name;
	int id;

	Employee(int sal, String name, int id) {
		this.sal = sal;
		this.name = name;
		this.id = id;
	}

	public String toString() {
		return this.sal + " " + this.name + " " + this.id;
	}

	public static void main(String[] args) {
		Employee e = new Employee( 30000,"kiran",123);
		System.out.println(e);
	}

}
