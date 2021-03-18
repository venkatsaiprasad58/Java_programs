package oops;

public class StudentDemo1 {
	int sno;
	String sname;
	void accept(int no,String name) {
		sno = no;
		sname = name; 
	}
	void display() {
		System.out.println("No :"+sno);
		System.out.println("sname :"+ sname);
	}

	public static void main(String[] args) {
		
		StudentDemo1 obj = new StudentDemo1();
		obj.accept(10, "prasad");
		obj.display();
		
		StudentDemo1 obj1 = new StudentDemo1();
		obj1.accept(20, "tarun");
		obj.display();
		
		StudentDemo1 obj2 = obj;
		obj2.display();
		
		obj.sname = "rayudu";
		
		obj.display();
		obj2.display();
		obj1.display();

	}

}
