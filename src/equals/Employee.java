package equals;

public class Employee {
	int sal;
	String name;
	int id;

	Employee(int sal, String name, int id) {
		this.sal = sal;
		this.name = name;
		this.id = id;
	}

	public boolean equals(Object Obj) {
		Employee e1 = (Employee) Obj;
		return this.id == e1.id;
	}

	public static void main(String[] args) {
		Employee e = new Employee( 30000,"kiran",123);
		Employee e1 = new Employee( 35000,"radhha",123);
		e.equals(e1);
	}


}