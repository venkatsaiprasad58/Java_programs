package oops;

public class CompileTimeDemo {
	static void sum() {
		System.out.println("Hi...");
	}
	final int sum(int a,int b) {
		return a+b;
	}
	private void sum(double a,double b,double c) {
		System.out.println(a+b+c);
	}
	void sum(String s1,String s2) {
		System.out.println("Sum = "+(s1+s2));
	}

	public static void main(String[] args) {
		CompileTimeDemo c = new CompileTimeDemo();
		c.sum(7.80, 9.90, 10.00);
		System.out.println(c.sum(10,20));
		c.sum();
		c.sum("prasad", "Royal");

	}

}
