package oops;

public class DemoStaticAndNonStatic {
	static int num;
	
	void count() {
		num++;
	}
	 
	
	int getNum() {
		return num;
	}

	public static void main(String[] args) {
		DemoStaticAndNonStatic obj1 = new DemoStaticAndNonStatic();
		DemoStaticAndNonStatic obj2 = new DemoStaticAndNonStatic();
		DemoStaticAndNonStatic obj3 = new DemoStaticAndNonStatic();
		
		
		
		obj1.count();
		obj1.count();
		obj1.count();
		
		
		obj2.count();
		obj2.count();
		
		
		obj3.count();
		
		
		System.out.println(obj1.getNum());
		System.out.println(obj2.getNum());
		System.out.println(obj3.getNum());
		

	}

}
