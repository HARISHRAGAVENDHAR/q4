package employee;
class Person {
    protected String name;
    protected int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    private int employeeID;
    private double salary;
    public Employee(String name, int age, int employeeID, double salary) {
        super(name, age);
        this.employeeID = employeeID;
        this.salary = salary;
    }
    public void displayInfo() {
        super.displayInfo();

        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: " + salary);
    }
}

public class main {

	public static void main(String[] args) {
		 Employee employee = new Employee("John Doe", 30, 101, 50000.0);
	        employee.displayInfo();

	}

}
