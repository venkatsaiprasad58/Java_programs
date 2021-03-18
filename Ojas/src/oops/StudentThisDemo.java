package oops;

public class StudentThisDemo {
	int sno;
	String sname;
	StudentThisDemo() {
		System.out.println("Deafult constructor");
	}
	StudentThisDemo(int sno,String sname) {
		this();
		this.sno = sno;
		this.sname = sname;
	}
	String StudentThisDemo() {
		return "No = "+sno+"\n"+"Name = "+sname;
	}

	public static void main(String[] args) {
		StudentThisDemo sd = new StudentThisDemo(101,"parasd");
		System.out.println(sd.StudentThisDemo());
	}

}
//two parameterised constructor