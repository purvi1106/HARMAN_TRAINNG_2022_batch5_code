package day1;
 class Employee {
	private int id;
	private int age;

	public Employee(int id, int age) {
		this.id = id;
		this.age = age;
	}

	public void show() {
		System.out.println("id is:" + id + "age is:" + age);
	}
}

 public class Demo{
	public static void main(String args[]) {
		Employee e = new Employee(1, 20);
		e.show();
	}
}