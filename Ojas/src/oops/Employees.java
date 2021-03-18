package oops;

public class Employees {
	private int id;
	private String empName;
	private double salary;
	private Address address;
	
	public Employees() {
		System.out.println("default");
	}
	
	@Override
	public String toString() {
		return "Employees [id=" + id + ", empName=" + empName + ", salary=" + salary + "]";
	}

	public Employees(int id, String empName, double salary) {
		super();
		this.id = id;
		this.empName = empName;
		this.salary = salary;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public static void main(String[] args) {
		Employees e = new Employees(101,"prasad",40000);
		System.out.println(e);
		e.setEmpName("rayudu");
		e.setId(102);
		e.setSalary(35000);
		System.out.println(e);
		
	}

}
