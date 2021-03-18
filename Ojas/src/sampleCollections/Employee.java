package sampleCollections;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	int eid;
	double esalary;
	String ename;
	public Employee(int eid, double esalary, String ename) {
		super();
		this.eid = eid;
		this.esalary = esalary;
		this.ename = ename;
	}


	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public double getEsalary() {
		return esalary;
	}


	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", esalary=" + esalary + ", ename=" + ename + "]";
	}


	public static void main(String[] args) {
		List<Employee> l = new ArrayList<Employee>();
		l.add(new Employee(1,1000,"prasad"));
		l.add(new Employee(2,2000,"anusha"));
		
		for(Employee e : l) {
			System.out.println("eid ="+ e.getEid()+" "+"ename ="+e.getEname()+" "+"esalary =" +e.getEsalary());
		}
		
	}

}
