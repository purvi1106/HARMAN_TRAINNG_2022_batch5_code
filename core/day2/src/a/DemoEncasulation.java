package a;

//as hard work --> success
// data hiding --> encapsulation
class Employee {
	private int id;
	private String name;
	private double salary;

	// id name : only once
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	
	public void print() {
		System.out.println("id : " + id + " name : " + name + " salary: " + salary);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}

public class DemoEncasulation {
	public static void main(String[] args) {
		Employee e = new Employee(1, "Raj", 45000);
		
		e.setSalary(e.getSalary()+1000);
		
		e.print();
		
	}
}
