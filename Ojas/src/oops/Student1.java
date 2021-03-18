package oops;

public class Student1 {
	int sno;
	String sname;

	
	public Student1(int sno, String sname) {
	
		this.sno = sno;
		this.sname = sname;
	}
	void dispStudent() {
		System.out.println("No : "+sno);
		System.out.println("Name : "+sname);
	}
}
class Marks extends Student1 {
	int m1,m2,m3;

	public Marks(int sno,String sname,int m1, int m2, int m3) {
		super(sno,sname);
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	int totMarks() {
		return m1+m2+m3;
	}
	void dispStudent() {
		System.out.println("No : "+sno);
		System.out.println("Name : "+sname);
		System.out.println("total Marks ="+totMarks());
		
	}
	
}

